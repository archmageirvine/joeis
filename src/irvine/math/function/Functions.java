package irvine.math.function;

/**
 * Convenience class collecting together available functions.
 * @author Sean A. Irvine
 */
public final class Functions {

  private Functions() { }

  /** Sum of divisors function. */
  public static final Function1 SIGMA = new Sigma();
  /** Number of divisors function. */
  public static final Function1 SIGMA0 = new Sigma0();
  /** Number of divisors function. */
  public static final Function1 TAU = SIGMA0; // Convenient synonym
  /** Ceiling square root. */
  public static final Function1 CEIL_SQRT = new CeilSqrt();
  /** Bitset indicating which digits are present in a number. */
  public static final Function1 SYNDROME = new Syndrome();
  /** Least primitive root of a modulus. */
  public static final Function1 LEAST_PRIMITIVE_ROOT = new LeastPrimitiveRoot();
  /** Describe the number. For example, 3445, is one 3, two 4s, one 5 to give 132415. */
  public static final Function1 LOOK_AND_SAY = new LookAndSay();

  /** Reverse the digits of a number. */
  public static final Function2 REVERSE = new Reverse();
  /** Sum of digits in a number. */
  public static final Function2 DIGIT_SUM = new DigitSum();
  /** Sum of the squares of the digits in a number. */
  public static final Function2 DIGIT_SUM_SQUARES = new DigitSumSquares();
  /** Digit sum root. */
  public static final Function2 DIGIT_SUM_ROOT = new DigitSumRoot();
  /** Product of digits. */
  public static final Function2 DIGIT_PRODUCT = new DigitProduct();
  /** Digit product root. */
  public static final Function2 DIGIT_PRODUCT_ROOT = new DigitProductRoot();
  /** Product of nonzero digits. */
  public static final Function2 DIGIT_NZ_PRODUCT = new DigitNonzeroProduct();
  /** Digit root of nonzero digits. */
  public static final Function2 DIGIT_NZ_PRODUCT_ROOT = new DigitNonzeroProductRoot();
  /** Count of distinct digits. */
  public static final Function2 DISTINCT_DIGIT_COUNT = new DistinctDigitCount();
  /** Rotate right by one digit. */
  public static final Function2 ROTATE_RIGHT = new RotateRight();
}
