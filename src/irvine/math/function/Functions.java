package irvine.math.function;

import java.util.Locale;

import irvine.math.z.Z;

/**
 * Convenience class collecting together available functions.
 * @author Sean A. Irvine
 */
public final class Functions {

  private Functions() { }

  /** Nth prime function. */
  public static final Function1 PRIME = new Prime();
  /** Prime counting function. */
  public static final Function1 PRIME_PI = new PrimePi();
  /** Next prime function. */
  public static final Function1 NEXT_PRIME = new NextPrime();
  /** Previous prime function. */
  public static final Function1 PREV_PRIME = new PrevPrime();
  /** Factorial. */
  public static final Function1 FACTORIAL = new Factorial();
  /** Primorial, product of all primes up to and including the parameter. */
  public static final Function1 PRIMORIAL = new Primorial();
  /** Factorial base representation. */
  public static final Function1 FACTORIAL_BASE = new FactorialBase();
  /** Product of the specified number of primes. */
  public static final Function1 PRIMORIAL_COUNT = new PrimorialCount();
  /** Fibonacci function. */
  public static final Function1 FIBONACCI = new Fibonacci();
  /** Lucas function. */
  public static final Function1 LUCAS = new Lucas();
  /** Euler totient function. */
  public static final Function1 PHI = new Phi();
  /** Euler co-totient function. */
  public static final Function1 COTOTIENT = new Cototient();
  /** Sum of divisors function. */
  public static final Function1 SIGMA = new Sigma();
  /** Number of divisors function. */
  public static final Function1 SIGMA0 = new Sigma0();
  /** Number of divisors function. */
  public static final Function1 TAU = SIGMA0; // Convenient synonym
  /** Number of distinct prime divisors function. */
  public static final Function1 OMEGA = new Omega();
  /** Number of distinct prime divisors counted with multiplicity function. */
  public static final Function1 BIG_OMEGA = new BigOmega();
  /** Sum of distinct prime divisors function. */
  public static final Function1 SOPF = new Sopf();
  /** Sum of prime divisors counted with multiplicity function. */
  public static final Function1 SOPFR = new Sopfr();
  /** The unique square free integer dividing a number. */
  public static final Function1 CORE = new Core();
  /** Mobius function. */
  public static final Function1 MOBIUS = new Mobius();
  /** Moebius function. */
  public static final Function1 MOEBIUS = MOBIUS;
  /** Mertens function. */
  public static final Function1 MERTENS = new Mertens();
  /** Least prime factor. */
  public static final Function1 LPF = new LeastPrimeFactor();
  /** Greatest prime factor. */
  public static final Function1 GPF = new GreatestPrimeFactor();
  /** Ceiling square root. */
  public static final Function1 CEIL_SQRT = new CeilSqrt();
  /** Bitset indicating which digits are present in a number. */
  public static final Function1 SYNDROME = new Syndrome();
  /** Step to the next number with the same number of set bits. */
  public static final Function1 SWIZZLE = new Swizzle();
  /** Least primitive root of a modulus. */
  public static final Function1 LEAST_PRIMITIVE_ROOT = new LeastPrimitiveRoot();
  /** Triangular function. */
  public static final Function1 TRIANGULAR = new Triangular();
  /** Index of the smallest triangular number greater than or equal to the given number. */
  public static final Function1 TRINV = new TriangularInverse();
  /** Describe the number. For example, 3445, is one 3, two 4s, one 5 to give 132415. */
  public static final Function1 LOOK_AND_SAY = new LookAndSay();
  /** Catalan function. */
  public static final Function1 CATALAN = new Catalan();
  /** Bell numbers. */
  public static final Function1 BELL = new BellNumbers();
  /** Number of partitions. */
  public static final Function1 PARTITIONS = new Partitions();
  /** Next power of two larger than the given number. */
  public static final Function1 NEXT_POWER_OF_2 = new NextPowerOf2();

  /** Reverse the digits of a number. */
  public static final Function2 REVERSE = new Reverse();
  /** Number of digits in a number. */
  public static final Function2 DIGIT_LENGTH = new DigitLength();
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
  /** Digit product persistence. */
  public static final Function2 DIGIT_PRODUCT_PERSISTENCE = new DigitProductPersistence();
  /** Product of nonzero digits. */
  public static final Function2 DIGIT_NZ_PRODUCT = new DigitNonzeroProduct();
  /** Digit root of nonzero digits. */
  public static final Function2 DIGIT_NZ_PRODUCT_ROOT = new DigitNonzeroProductRoot();
  /** Count of distinct digits. */
  public static final Function2 DISTINCT_DIGIT_COUNT = new DistinctDigitCount();
  /** Sort the digits of a number into ascending order. */
  public static final Function2 DIGIT_SORT_ASCENDING = new DigitSortAscending();
  /** Sort the digits of a number into descending order. */
  public static final Function2 DIGIT_SORT_DESCENDING = new DigitSortDescending();
  /** Rotate right by one digit. */
  public static final Function2 ROTATE_RIGHT = new RotateRight();
  /** Multifactorial (including double factorial). */
  public static final Function2 MULTIFACTORIAL = new Multifactorial();
  /** Number of points in a hypersphere of given radius in a given number of dimensions. */
  public static final Function2 HYPERSPHERE_POINTS = new HyperspherePoints();

  /**
   * Get a function from its name.
   * @param name function name
   * @return the function
   * @throws NoSuchFieldException if the function was not found
   */
  public static Function1 getFunction(final String name) throws NoSuchFieldException {
    try {
      return (Function1) Functions.class.getField(name.toUpperCase(Locale.getDefault())).get(null);
    } catch (IllegalAccessException e) {
      throw new RuntimeException("Could not access " + name);
    }
  }

  /**
   * Apply a function or chain of functions in postfix form.
   * For example, <code>Functions 42 catalan phi</code> returns
   * <code>phi(catalan(42))</code>
   * @param args expression
   */
  public static void main(final String[] args) throws NoSuchFieldException {
    Z value = new Z(args[0]);
    for (int k = 1; k < args.length; ++k) {
      value = getFunction(args[k]).z(value);
    }
    System.out.println(value);
  }
}
