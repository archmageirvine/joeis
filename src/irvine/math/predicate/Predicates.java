package irvine.math.predicate;

/**
 * Convenience class collecting together available predicates.
 * @author Sean A. Irvine
 */
public final class Predicates {

  private Predicates() { }

  /** Test if a number is a prime. */
  public static final Predicate PRIME = new Prime();
  /** Test if a number is an emirp (both the number and its reversal is a different prime). */
  public static final Predicate EMIRP = new Emirp();
  /** Test if a number is a semiprime. */
  public static final Predicate SEMIPRIME = new Semiprime();
  /** Test if a number is a square. */
  public static final Predicate SQUARE = new Square();
  /** Test if a number is a cube. */
  public static final Predicate CUBE = new Cube();
  /** Test if a number is a non-trivial power. */
  public static final Predicate POWER = new Power();
  /** Test if a number is a prime power. */
  public static final Predicate PRIME_POWER = new PrimePower();
  /** Test if a number is a nontrivial prime power (i.e., with exponent &gt; 1). */
  public static final Predicate NONTRIVIAL_PRIME_POWER = new NontrivialPrimePower();
  /** Test if a number is a power of 2. */
  public static final Predicate POWER_OF_TWO = new PowerOfTwo();
  /** Test if a number is triangular. */
  public static final Predicate TRIANGULAR = new Triangular();
  /** Test if a number is square free. */
  public static final Predicate SQUARE_FREE = new SquareFree();
  /** Test if a number is cube free. */
  public static final Predicate CUBE_FREE = new CubeFree();
  /** Test if a number is a Fibonacci number. */
  public static final Predicate FIBONACCI = new Fibonacci();
  /** Test if a number is a Lucas number. */
  public static final Predicate LUCAS = new Lucas();
  /** Test if a number is perfect. */
  public static final Predicate PERFECT = new Perfect();
  /** Test if a number is abundant. */
  public static final Predicate ABUNDANT = new Abundant();
  /** Test if a number is deficient. */
  public static final Predicate DEFICIENT = new Deficient();
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
  /** Test if a number is a St\u00f8rmer number. */
  public static final Predicate STORMER = new Stormer();
  /** Test if a number is a Super-Poulet number. */
  public static final Predicate SUPER_POULET = new SuperPoulet();

  /** Test if a number is a palindrome in a base. */
  public static final Predicate2 PALINDROME = new Palindrome();
  /** Test if a number is <code>t</code>-polygonal. */
  public static final Predicate2 POLYGONAL = new Polygonal();
  /** Test if a number is a strong pseudoprime. */
  public static final Predicate2 STRONG_PSEUDOPRIME = new StrongPseudoprime();
  /** Test if a number is a repeated digit in a base. */
  public static final Predicate2 REPDIGIT = new Repdigit();
}
