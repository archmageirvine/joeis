/*
MIT License

Copyright (c) 2019 Vladimir Reshetnikov <v.reshetnikov@gmail.com>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package irvine.math;

import java.util.Arrays;

/**
 * A value of this type represents a non-negative integer that can be very large
 * (like those that occur as numeric values of high power towers, much larger
 * than those that can be represented by <code>Z.class</code> within feasible
 * memory limits), subject to a condition that either: the number fits into long
 * type verbatim, or the number of 1's in its binary form is a moderate number
 * (such that an array of that size can be allocated), and each of the positions
 * of 1's in its binary form is, recursively, a number that can be represented
 * by <code>SparseInteger</code>.
 *
 * @author Vladimir Reshetnikov
 * @author Sean A. Irvine (port to Java)
 */
public final class SparseInteger implements Comparable<SparseInteger> {

  // Original in C# uses unsigned long for base type.  Java lacks a native unsigned long type.
  // While it would be possible to work around this, it is simpler to sacrifice one more bit
  // and use signed long instead.

  private static final SparseInteger ZERO = create(0);
  private static final SparseInteger ONE = create(1);


  // This type is an immutable value type.
  //
  // An value of this type stores its numeric value as a sorted array of positions of 1's in its binary form,
  // where each position is stored, recursively, as <see cref="SparseInteger"/>, except that the numeric value
  // is stored verbatim in the field <see cref="value"/> of type <see cref="long"/> if it fits into that type
  // (in the latter case property <see cref="isSmall"/> returns <c>true</c>).

  // The numeric value of this value if it fits into long type, otherwise 0.
  private long mValue;

  // An sorted array of positions of 1's in the binary form of this number,
  // stored from lowest (least significant) to highest (most significant).
  //
  // If this field is null, then the field value is used
  // to represent such "small" number verbatim.
  private SparseInteger[] mPositions;

  /// <summary>
  /// Initializes a value of <see cref="SparseInteger"/> type,
  /// from either:
  /// <list type="bullet">
  /// <item>
  /// a list of positions of 1's in its binary form (provided through <paramref name="positions"/>) or
  /// </item>
  /// <item>
  //  its verbatim representation in <see cref="long"/> type (provided through <paramref name="value"/>).
  /// </item>
  /// </list>
  /// </summary>
  /// <remarks>At most one of the parameters can have a non-default value.</remarks>
  private SparseInteger(final SparseInteger[] positions, final long value) {
    assert value == 0 || positions == null;
    if (positions != null && positions.length == 0) {
      throw new IllegalArgumentException("Empty positions not allowed");
    }
    mValue = value;
    mPositions = positions;
  }

  /**
   * Construct the sparse integer for the given long value.
   * @param x value
   * @return sparse integer
   */
  public static SparseInteger create(final long x) {
    return new SparseInteger(null, x);
  }

  private SparseInteger create(final SparseInteger v) {
    return new SparseInteger(new SparseInteger[] {v}, 0);
  }

  // Gets a boolean value indicating whether this value stores its numeric value verbatim
  // in the field <see cref="value"/>. We refer to such values as "small".
  private boolean isSmall() {
    return mPositions == null;
  }

  // Gets a sorted array of positions of 1's in binary form of this number.
  //
  // This property can be used both on "small" and "large" numbers (<see cref="isSmall"/>).
  private SparseInteger[] getPositions() {
    if (!isSmall()) {
      return mPositions;
    }

    long v = mValue;
    final SparseInteger[] positions = new SparseInteger[Long.bitCount(v)];
    int position = 0;

    int k = 0;
    while (v != 0) {
      if ((v & 1) == 1) {
        positions[k++] = SparseInteger.create(position);
      }
      v >>>= 1;
      ++position;
    }
    assert k == positions.length;
    return positions;
  }

  @Override
  public int hashCode() {
    return isSmall() ? Long.hashCode(mValue) : Arrays.hashCode(mPositions);
  }

//  /**
//   * Test if this sparse integer is the same as a particular long value
//   * @param other other value
//   * @return true iff they are equal
//   */
//  public boolean equals(final long other) {
//    return isSmall() && mValue == other;
//  }

  @Override
  public boolean equals(final Object other) {
    if (!(other instanceof SparseInteger)) {
      return false;
    }
    final SparseInteger o = (SparseInteger) other;
    return isSmall() ? mValue == o.mValue : Arrays.equals(mPositions, o.mPositions);
  }

  @Override
  public int compareTo(final SparseInteger other) {
    if (isSmall()) {
      if (other.isSmall()) {
        return Long.compare(mValue, other.mValue);
      }
      // values that fit into long type are always stored in the value field
      return -1;
    } else if (other.isSmall()) {
      // values that fit into long type are always stored in the value field
      return 1;
    }

    // fast reference equality check
    if (mPositions == other.mPositions) {
      return 0;
    }

    // Compare bitwise starting from the highest (most significant) bit
    int thisPosition = mPositions.length - 1;
    int otherPosition = other.mPositions.length - 1;
    while (true) {
      final int result = mPositions[thisPosition].compareTo(other.mPositions[otherPosition]);
      if (result != 0) {
        return result;
      }

      if (--thisPosition < 0) {
        return --otherPosition < 0 ? 0 : -1; // all compared bits are identical, but the other number has more bits
      }

      if (--otherPosition < 0) {
        // all compared bits are identical, but this number has more bits
        return 1;
      }
    }
  }

  private static SparseInteger[] insert(final SparseInteger[] array, final SparseInteger item) {
    if (array == null || array.length == 0) {
      return new SparseInteger[] {item};
    }

    final int index = ~Arrays.binarySearch(array, item);
    if (index < 0) {
      throw new IllegalArgumentException("The item already exists.");
    }

    final SparseInteger[] newArray = new SparseInteger[array.length + 1];
    if (index > 0) {
      System.arraycopy(array, 0, newArray, 0, index);
    }
    newArray[index] = item;
    if (index < newArray.length - 1) {
      System.arraycopy(array, index, newArray, index + 1, array.length - index);
    }
    return newArray;
  }

  // Special value used to indicate item was not removed
  private static final SparseInteger[] NOT_REMOVED = new SparseInteger[0];

  private static SparseInteger[] remove(final SparseInteger[] array, final SparseInteger item)  {
    if (array == null || array.length == 0) {
      return NOT_REMOVED;
    }
    final int index = Arrays.binarySearch(array, item);
    if (index < 0) {
      return NOT_REMOVED;
    }
    if (array.length == 1) {
      return null;
    }
    final SparseInteger[] newArray = new SparseInteger[array.length - 1];
    if (index > 0) {
      System.arraycopy(array, 0, newArray, 0, index);
    }
    if (index < array.length - 1) {
      System.arraycopy(array, index + 1, newArray, index, array.length - 1 - index);
    }
    return newArray;
  }


  // Returns this number plus 1.
  private SparseInteger addOne() {
    if (isSmall()) {
      final long value = mValue + 1;
      return value < mValue ? create(SparseInteger.create(63)) : SparseInteger.create(value);
    }

    final SparseInteger[] positionsNew = remove(mPositions, ZERO);
    return positionsNew != NOT_REMOVED
      // the bit was not set, set it
      ? add(new SparseInteger(positionsNew, 0L), SparseInteger.create(2))
      // the bit was set, carry to the next position
      : new SparseInteger(insert(mPositions, ZERO), 0);
  }

  /**
   * Add.
   * @param x addend
   * @param y addend
   * @return the sum <code>x + y</code>
   */
  public static SparseInteger add(final SparseInteger x, final SparseInteger y) {
    if (x.equals(ZERO)) {
      return y;
    }
    if (y.equals(ZERO)) {
      return x;
    }
    if (x.isSmall() && y.isSmall()) {
      final long sum = x.mValue + y.mValue;
      if (sum > x.mValue) {
        return SparseInteger.create(sum); // if no overflow
      }
    }

    SparseInteger[] xPositions = x.getPositions();
    SparseInteger[] yPositions = y.getPositions();

    // swap if necessary to make yPositions shorter
    if (yPositions.length > xPositions.length) {
      final SparseInteger[] t = xPositions;
      xPositions = yPositions;
      yPositions = t;
    }

    for (final SparseInteger position : yPositions) {
      final SparseInteger[] xPositionsNew = remove(xPositions, position);
      xPositions = xPositionsNew != NOT_REMOVED
        ? add(new SparseInteger(xPositionsNew, 0), position.addOne().exp2()).getPositions()
        : insert(xPositions, position);
    }

    return new SparseInteger(xPositions, 0);
  }

  /**
   * Multiply.
   * @param x number
   * @param y number
   * @return the product <code>x * y</code>
   */
  public static SparseInteger multiply(final SparseInteger x, final SparseInteger y) {
    if (x.equals(ZERO) || y.equals(ZERO)) {
      return ZERO;
    }

    if (x.equals(ONE)) {
      return y;
    }

    if (y.equals(ONE)) {
      return x;
    }

    if (x.isSmall() && y.isSmall()) {
      final long product = x.mValue * y.mValue;
      if (product / y.mValue == x.mValue) {
        // if no overflow
        return create(product);
      }
    }

    SparseInteger result = ZERO;
    for (final SparseInteger position : y.getPositions()) {
      result = add(result, x.multiplyByExp2(position));
    }
    return result;
  }

  /**
   * Powers of 2.
   * @return <code>2^this</code>
   */
  public SparseInteger exp2() {
    return isSmall() && mValue < 63
      ? create(1L << mValue)
      : create(this);
  }

  /**
   * Logarithm base 2.
   * @return <code>log_2(this)</code>
   */
  public SparseInteger log2() {
    if (!isSmall()) {
      if (mPositions.length != 1) {
        throw new ArithmeticException("This number is not an exact power of two.");
      }
      return mPositions[0];
    }
    if ((mValue & (mValue - 1)) != 0) {
      throw new ArithmeticException("This number is not an exact power of two.");
    }
    return create(Long.numberOfTrailingZeros(mValue));
  }

  // The result of <c>this.MultiplyByAntiLog2(x)</c> is equivalent to <c>this * x.exp2()</c>,
  // but can be faster in many cases.
  private SparseInteger multiplyByExp2(final SparseInteger power) {
    if (equals(ZERO) || power.equals(ZERO)) {
      return this;
    }

    if (isSmall() && power.isSmall() && power.mValue < 62) {
      final long result = mValue << power.mValue;
      if ((result >> power.mValue) == mValue) { // Use >>> if trying to handle 64 bits here!
        // if no overflow
        return create(result);
      }
    }

    final SparseInteger[] positions = getPositions();
    final SparseInteger[] positionsNew = new SparseInteger[positions.length];
    for (int k = 0; k < positions.length; ++k) {
      positionsNew[k] = add(positions[k], power);
    }
    return new SparseInteger(positionsNew, 0);
  }

  /**
   * Powers of power of 2. That is, this must be a power of 2.
   * @param exponent exponent to apply
   * @return <code>this^exponent</code>
   */
  public SparseInteger power(final SparseInteger exponent) {
    return multiply(log2(), exponent).exp2();
  }
}
