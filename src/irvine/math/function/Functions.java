package irvine.math.function;

/**
 * Convenience class collecting together available functions.
 * @author Sean A. Irvine
 */
public final class Functions {

  private Functions() { }

  /** Ceiling square root. */
  public static final Function1 CEIL_SQRT = new CeilSqrt();
  /** Bitset indicating which digits are present in a number. */
  public static final Function1 SYNDROME = new Syndrome();
  /** Least primitive root of a modulus. */
  public static final Function1 LEAST_PRIMITIVE_ROOT = new LeastPrimitiveRoot();

  /** Reverse the digits of a number. */
  public static final Function2 REVERSE = new Reverse();
  /** Sum of digits. */
  public static final Function2 DIGIT_SUM = new DigitSum();
  /** Product of digits. */
  public static final Function2 DIGIT_PRODUCT = new DigitProduct();
  /** Product of nonzero digits. */
  public static final Function2 DIGIT_NZ_PRODUCT = new DigitNonzeroProduct();
  /** Rotate right by one digit. */
  public static final Function2 ROTATE_RIGHT = new RotateRight();
}
