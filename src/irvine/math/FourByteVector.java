package irvine.math;

/**
 * Implements a vector of four 8-bit elements in a single long.  The elements
 * are numbered 0, 1, 2, and 3 with 0 being the rightmost element.
 *
 * @author Sean A. Irvine
 */
public final class FourByteVector {

  private FourByteVector() { }

  private static final int ELEMENTS = 4;
  private static final int ELEMENT_BITS = 8; // must be a power of 2
  private static final int SHIFT_MODULUS = ELEMENT_BITS - 1;
  private static final int SPACER_BITS = 2 * ELEMENT_BITS;
  private static final int TWO_SPACER_BITS = 2 * SPACER_BITS;
  private static final int ELEMENT_MASK = (1 << ELEMENT_BITS) - 1;
  private static final long LONG_ELEMENT_MASK = ELEMENT_MASK;
  private static final long MASK_ALL_ELEMENTS;
  static {
    long m = -1;
    while (m < 0) {
      m <<= SPACER_BITS;
      m |= LONG_ELEMENT_MASK;
    }
    MASK_ALL_ELEMENTS = m;
  }
  private static final long SIGN_BITS = constant(128);
  private static final long NEGATION_CONSTANT = SIGN_BITS << 1;

  /**
   * Pack the given elements into a 4-element vector.  At most the last four
   * elements appear in the result.  If less than four elements are specified
   * then the remaining elements are taken to be zero.  The first element
   * specified is the rightmost element in the vector, etc.
   *
   * @param e elements to pack
   * @return the vector
   */
  public static long pack(final int... e) {
    long v = 0;
    for (int k = e.length - 1; k >= 0; --k) {
      v <<= SPACER_BITS;
      v += e[k];
    }
    return v;
  }

  /**
   * Retrieve the four elements of the vector as an array of <code>int</code>s.
   * This function satisfies <code>v == pack(unpack(v))</code>.
   *
   * @param v a <code>long</code> value
   * @return an <code>int[]</code> value
   */
  public static int[] unpack(long v) {
    final int[] e = new int[ELEMENTS];
    for (int k = 0; v != 0; ++k) {
      e[k] = (int) v & ELEMENT_MASK;
      v >>>= SPACER_BITS;
    }
    return e;
  }

  /**
   * Set a specific element of the vector overriding the previous value at the
   * specified position.  No bounds checking is performed.
   *
   * @param v the vector
   * @param e new element
   * @param p position to install element
   * @return resulting vector
   */
  public static long set(long v, final int e, final int p) {
    final int shift = SPACER_BITS * p;
    v &= ~(LONG_ELEMENT_MASK << shift);
    return v + ((long) e << shift);
  }

  /**
   * Retrieve the specified element as an unsigned byte.
   *
   * @param v vector
   * @param p element position
   * @return element value
   */
  public static int get(final long v, final int p) {
    final int shift = SPACER_BITS * p;
    return (int) (v >>> shift) & ELEMENT_MASK;
  }

  /**
   * Construct a vector where every element has the given value.
   *
   * @param e value
   * @return vector of value
   */
  public static long constant(final int e) {
    // Implementation is specific to having 4 elements!
    final long v = e + (e << SPACER_BITS);
    return v + (v << TWO_SPACER_BITS);
  }

  /**
   * Bitwise and of two vectors.
   *
   * @param v1 first vector
   * @param v2 second vector
   * @return resulting vector
   */
  public static long and(final long v1, final long v2) {
    return v1 & v2;
  }

  /**
   * Bitwise or of two vectors.
   *
   * @param v1 first vector
   * @param v2 second vector
   * @return resulting vector
   */
  public static long or(final long v1, final long v2) {
    return v1 | v2;
  }

  /**
   * Bitwise xor of two vectors.
   *
   * @param v1 first vector
   * @param v2 second vector
   * @return resulting vector
   */
  public static long xor(final long v1, final long v2) {
    return v1 ^ v2;
  }

  /**
   * Bitwise and of a vector by a scalar.
   *
   * @param v vector
   * @param s scalar
   * @return resulting vector
   */
  public static long and(final long v, final int s) {
    return v & constant(s);
  }

  /**
   * Bitwise or of a vector by a scalar.
   *
   * @param v vector
   * @param s scalar
   * @return resulting vector
   */
  public static long or(final long v, final int s) {
    return v | constant(s);
  }

  /**
   * Bitwise xor of a vector by a scalar.
   *
   * @param v vector
   * @param s scalar
   * @return resulting vector
   */
  public static long xor(final long v, final int s) {
    return v ^ constant(s);
  }

  /**
   * Complement each element of a vector.
   *
   * @param v vector to complement
   * @return complemented vector
   */
  public static long not(final long v) {
    return ~v & MASK_ALL_ELEMENTS;
  }

  /**
   * Shift each element of the vector left by the specified amount.
   *
   * @param v vector shift
   * @param shift amount to shift each element
   * @return shifted vector
   */
  public static long lsl(final long v, final int shift) {
    return (v << (shift & SHIFT_MODULUS)) & MASK_ALL_ELEMENTS;
  }

  /**
   * Shift each element of the vector right by the specified amount.
   * The element been shifted is treated as unsigned.
   *
   * @param v vector shift
   * @param shift amount to shift each element
   * @return shifted vector
   */
  public static long lsr(final long v, final int shift) {
    return (v >> (shift & SHIFT_MODULUS)) & MASK_ALL_ELEMENTS;
  }

  /**
   * Shift each element of the vector right by the specified amount.
   * The sign bit of each element is preserved.
   *
   * @param v vector shift
   * @param shift amount to shift each element
   * @return shifted vector
   */
  public static long asr(final long v, final int shift) {
    final long z = v & SIGN_BITS;
    final long u = (z << ELEMENT_BITS) - z;
    return lsr(v + (u << 1), shift);
  }

  /**
   * Negate each element of the vector.
   *
   * @param v vector
   * @return negated vector
   */
  public static long negate(final long v) {
    return (NEGATION_CONSTANT - v) & MASK_ALL_ELEMENTS;
  }

  /**
   * Add two vectors.
   *
   * @param v1 first vector
   * @param v2 second vector
   * @return vector sum
   */
  public static long add(final long v1, final long v2) {
    return (v1 + v2) & MASK_ALL_ELEMENTS;
  }

  /**
   * Add a scalar to each element of the vector.
   *
   * @param v vector
   * @param scalar scalar
   * @return vector sum
   */
  public static long add(final long v, final int scalar) {
    return add(v, constant(scalar));
  }

  /**
   * Subtract one vector from another.
   *
   * @param v1 first vector
   * @param v2 second vector
   * @return <code>v1 - v2</code>
   */
  public static long sub(final long v1, final long v2) {
    return (v1 + NEGATION_CONSTANT - v2) & MASK_ALL_ELEMENTS;
  }

  /**
   * Multiply a vector by a scalar.
   *
   * @param v vector
   * @param scalar scalar
   * @return scaled vector
   */
  public static long mul(final long v, final int scalar) {
    return (v * scalar) & MASK_ALL_ELEMENTS;
  }

  /**
   * Multiply two vectors in an element-by-element fashion.
   *
   * @param v1 first vector
   * @param v2 second vector
   * @return element-wise product
   */
  public static long mul(final long v1, final long v2) {
    long t1 = v1;
    long t2 = v2;
    long r = 0;
    for (int s = 0; t1 != 0; s += SPACER_BITS) {
      r += ((t1 * t2) & ELEMENT_MASK) << s;
      t1 >>= SPACER_BITS;
      t2 >>= SPACER_BITS;
    }
    return r;

    /*
    // More complex solution, but using only two multiplications
    // Unlikely to be faster due to excessive shifting
    System.out.println(Long.toHexString(v1) + "*" + Long.toHexString(v2));
    final long t1 = ((v1 & 0xFF0000L) << ELEMENT_BITS) + (v1 & ELEMENT_MASK);
    final long t2 = ((v2 & 0xFF0000L) << ELEMENT_BITS) + (v2 & ELEMENT_MASK);
    final long s1 = ((v1 & 0xFF000000000000L) >> (TWO_SPACER_BITS - 8)) + ((v1 >> TWO_SPACER_BITS) & ELEMENT_MASK);
    final long s2 = ((v2 & 0xFF000000000000L) >> (TWO_SPACER_BITS - 8)) + ((v2 >> TWO_SPACER_BITS) & ELEMENT_MASK);

    final long p1 = t1 * t2;
    final long p2 = s1 * s2;
    System.out.println(Long.toHexString(p1) + " " + Long.toHexString(p2));
    final long r = (p1 & ELEMENT_MASK) + ((p1 & 0xFF000000000000L) >>> TWO_SPACER_BITS) + ((p2 & ELEMENT_MASK) << TWO_SPACER_BITS) + ((p2 & 0xFF000000000000L));
    System.out.println(Long.toHexString(r));
    return r;
    */
  }
}
