package irvine.math.predicate;

/**
 * Convenience class collecting together available predicates.
 * @author Sean A. Irvine
 */
public final class Predicates {

  private Predicates() { }

  /** Test if a number is a square. */
  public static final Predicate SQUARE = new Square();
  /** Test if a number is a cube. */
  public static final Predicate CUBE = new Cube();
  /** Test if a number is a non-trivial power. */
  public static final Predicate POWER = new Power();
  /** Test if a number is triangular. */
  public static final Predicate TRIANGULAR = new Triangular();
  /** Test if a number is square free. */
  public static final Predicate SQUARE_FREE = new SquareFree();
  /** Test if a number is a Fibonacci number. */
  public static final Predicate FIBONACCI = new Fibonacci();
  /** Test if a number is a Lucas number. */
  public static final Predicate LUCAS = new Lucas();
  /** Test if a number is practical. */
  public static final Predicate PRACTICAL = new Practical();
  /** Test if a number has non-decreasing digits in base 10. */
  public static final Predicate DIGIT_NONDECREASING = new DigitNondecreasing();
  /** Test if a number has non-increasing digits in base 10. */
  public static final Predicate DIGIT_NONINCREASING = new DigitNonincreasing();
  /** Test if a number contains a zero digit. */
  public static final Predicate DIGIT_CONTAINS_ZERO = new DigitContainsZero();
  /** Test if a number contains undulating digits. */
  public static final Predicate DIGIT_UNDULATE = new DigitUndulate();

  /** Test if a number is a palindrome in a base. */
  public static final Predicate2 PALINDROME = new Palindrome();
  /** Test if a number is <code>t</code>-polygonal. */
  public static final Predicate2 POLYGONAL = new Polygonal();
}
