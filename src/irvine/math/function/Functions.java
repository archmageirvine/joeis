package irvine.math.function;

/**
 * Convenience class collecting together available functions.
 * @author Sean A. Irvine
 */
public final class Functions {

  private Functions() { }

  /** Ceiling square root. */
  public static final Function1 CEIL_SQRT = new CeilSqrt();
  /** Sum of digits. */
  public static final Function2 DIGIT_SUM = new DigitSum();
  /** Product of digits. */
  public static final Function2 DIGIT_PRODUCT = new DigitProduct();
  /** Rotate right by one digit. */
  public static final Function2 ROTATE_RIGHT = new RotateRight();
}
