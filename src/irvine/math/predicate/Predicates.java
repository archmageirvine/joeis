package irvine.math.predicate;

/**
 * Convenience class collecting together available predicates.
 * @author Sean A. Irvine
 */
public final class Predicates {

  private Predicates() { }

  /** Test if a number is a prime. */
  public static final Predicate PRIME = new Prime(); // =A000040
  /** Test if a number is a semiprime. */
  public static final Predicate SEMIPRIME = new Semiprime(); // =A001358
  /** Test if a number is a square. */
  public static final Predicate SQUARE = new Square(); // =A000290
  /** Test if a number is a cube. */
  public static final Predicate CUBE = new Cube(); // =A000578
  /** Test if a number is a non-trivial power. */
  public static final Predicate POWER = new Power(); // =A001597
  /** Test if a number is a prime power. */
  public static final Predicate PRIME_POWER = new PrimePower(); // =A000961, 
  /** Test if a number is a nontrivial prime power (i.e., with exponent &gt; 1). */
  public static final Predicate NONTRIVIAL_PRIME_POWER = new NontrivialPrimePower(); // =A246547
  /** Test if a number is a power of 2. */
  public static final Predicate POWER_OF_TWO = new PowerOfTwo(); // =A000079
  /** Test if a number is triangular. */
  public static final Predicate TRIANGULAR = new Triangular(); // =A000217
  /** Test if a number is squareful. */
  public static final Predicate SQUAREFUL = new Squareful();
  /** Test if a number is square free. */
  public static final Predicate SQUARE_FREE = new SquareFree(); // =A005117
  /** Test if a number is cubeful. */
  public static final Predicate CUBEFUL = new Cubeful(); // =A036966
  /** Test if a number is cube free. */
  public static final Predicate CUBE_FREE = new CubeFree(); // =A004709
  /** Test if a number is a Fibonacci number. */
  public static final Predicate FIBONACCI = new Fibonacci(); // =A000045
  /** Test if a number is a Lucas number. */
  public static final Predicate LUCAS = new Lucas(); // =A000032, =A000204
  /** Test if a number is perfect. */
  public static final Predicate PERFECT = new Perfect(); // =A000396
  /** Test if a number is a primorial. */
  public static final Predicate PRIMORIAL = new Primorial(); // =A002110
  /** Test if a number is arithmetic. */
  public static final Predicate ARITHMETIC = new Arithmetic(); // =A003601
  /** Test if a number is balanced. */
  public static final Predicate BALANCED = new Balanced(); // =A020492
  /** Test if a number is a Carmichael number. */
  public static final Predicate CARMICHAEL = new Carmichael(); // =A002997
  /** Test if a number is a Chen prime: p is prime and p+2 is either prime or semiprime. */
  public static final Predicate CHEN_PRIME = new ChenPrime(); // =A109611
  /** Test if a number is a Sophie-Germain prime: p and 2p+1 are prime. */
  public static final Predicate SOPHIE_GERMAIN = new SophieGermain(); // =A005384
  /** Test if a number is a Perrin number. */
  public static final Predicate PERRIN = new Perrin(); // =A013998
  /** Test if a number is a harmonic number as defined by Ore. */
  public static final Predicate ORE_HARMONIC = new OreHarmonic(); // =A001599
  /** Test if a number is powerful. */
  public static final Predicate POWERFUL = new Powerful(); // =A001694
  /** Test if a number is happy. */
  public static final Predicate HAPPY = new Happy(); // =A007770
  /** Test if a number is a Cyclops number. */
  public static final Predicate CYCLOPS = new Cyclops(); // =A134808
  /** Test if a number is a Niven (or Harshad) number. */
  public static final Predicate NIVEN = new Niven(); // =A134808
  /** Test if a number is economical. */
  public static final Predicate ECONOMICAL = new Economical(); // =A046759
  /** Test if a number is a Proth number. */
  public static final Predicate PROTH = new Proth(); // =A080075
  /** Test if a number is abundant. */
  public static final Predicate ABUNDANT = new Abundant(); // =A005101
  /** Test if a number is deficient. */
  public static final Predicate DEFICIENT = new Deficient(); // =A005100
  /** Test if a number is practical. */
  public static final Predicate PRACTICAL = new Practical(); // =A005153
  /** Test if a number has non-decreasing digits in base 10. */
  public static final Predicate DIGIT_NONDECREASING = new DigitNondecreasing(); // =A009994
  /** Test if a number has non-increasing digits in base 10. */
  public static final Predicate DIGIT_NONINCREASING = new DigitNonincreasing(); // =A009996
  /** Test if a number contains a zero digit. */
  public static final Predicate DIGIT_CONTAINS_ZERO = new DigitContainsZero(); // =A011540
  /** Test if a number contains undulating digits. */
  public static final Predicate DIGIT_UNDULATE = new DigitUndulate(); // =A033619
  /** Test if a number has digits with alternating parity. */
  public static final Predicate DIGIT_ALTERNATING_PARITY = new DigitAlternatingParity();
  /** Test if a number is a St\u00f8rmer number. */
  public static final Predicate STORMER = new Stormer(); // =A005528
  /** Test if a number is a Super-Poulet number. */
  public static final Predicate SUPER_POULET = new SuperPoulet(); // =A050217
  /** Test if a number is a 2-dense. */
  public static final Predicate TWO_DENSE = new TwoDense(); // =A174973

  /** Test if a number is an emirp (both the number and its reversal is a different prime). */
  public static final Predicate2 EMIRP = new Emirp(); // =A006567
  /** Test if a number is brilliant: semiprime, and both primes with the same decimal length. */
  public static final Predicate2 BRILLIANT = new Brilliant(); // =A078972(10
  /** Test if a number is a palindrome in a base. */
  public static final Predicate2 PALINDROME = new Palindrome(); // =A002113(10   
  /** Test if a number is <code>t</code>-polygonal. */
  public static final Predicate2 POLYGONAL = new Polygonal(); // =A000217(3, =A000326(5, =A000384(6, =A000566(7, =A000567(8, =A001106(9, =A001107(10, =A051682(11, =A051624(12, =A051865(13, =A051866(14, =A051867(15, =A051868(16, =A051869(17, =A051870(18, =A051871(19, =A051872(20, =A051873(21, =A051874(22, =A051875(23, =A051876(24,
  /** Test if a number is a strong pseudoprime. */
  public static final Predicate2 STRONG_PSEUDOPRIME = new StrongPseudoprime(); // =A001262(2, =A020229(3, =A020230(4, =A020231(5, =A020232(6, =A020233(7, =A020326(100, etc.
  /** Test if a number is a repeated digit in a base. */
  public static final Predicate2 REPDIGIT = new Repdigit();
  /** Test if a number is zeroless in a base. */
  public static final Predicate2 ZEROLESS = new Zeroless(); // =A052382(10,
  /** Test if a number is p-smooth: all prime divisors are &lt;= p. */
  public static final Predicate2 SMOOTH = new Smooth(); // =A003586(3, =A051037(5, =A002473(7, =A051038(11, =A080197(13, =A080681(17, =A080682(19, =A080683(23
  /** Test if a number is a repeated digit in a base. */
  public static final Predicate2 ECHO = new Echo(); // =A383927(2, =A383896(10
  /** Test if a number is a Harshad number in a base. */
  public static final Predicate2 HARSHAD = new Harshad(); // =A005349(10
}
