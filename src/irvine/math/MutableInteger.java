package irvine.math;

/**
 * A mutable integer sometimes useful as variable parameter or for storing
 * mutable integers as values in a collection.
 * @author Sean A. Irvine
 */
public class MutableInteger {

  int mValue = 1;

  /**
   * Create a mutable integer with specified initial value
   * @param initialValue initial value
   */
  public MutableInteger(final int initialValue) {
    mValue = initialValue;
  }

  /** Initialize a mutable integer to 0. */
  public MutableInteger() {
    this(0);
  }

  /**
   * Set the value of this integer
   * @param value value to set
   */
  public void set(final int value) {
    mValue = value;
  }

  /**
   * Retrieve the value of this integer.
   * @return value
   */
  public int get() {
    return mValue;
  }

  /**
   * Increment the value returning the previous value
   * @return previous value
   */
  public int postIncrement() {
    return mValue++;
  }

  /**
   * Decrement the value returning the previous value
   * @return previous value
   */
  public int postDecrement() {
    return mValue--;
  }

  @Override
  public String toString() {
    return String.valueOf(mValue);
  }
}

