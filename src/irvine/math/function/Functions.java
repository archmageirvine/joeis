package irvine.math.function;

import java.util.Locale;

import irvine.math.z.Z;

/**
 * Convenience class collecting together available functions.
 * The comments of the form "// =A-number" are evaluated automatically by the generator.
 * @author Sean A. Irvine
 */
public final class Functions {

  private Functions() { }

  // WARNING: There is a certain amount of trickiness here in that the order in which
  // these functions are initialized matters.

  // One argument functions

  // SQRT must be initialized before PRIME
  /** Floor square root (truncating square root). */
  public static final Function1 SQRT = new Sqrt(); // =A000196
  /** Ceiling square root. */
  public static final Function1 CEIL_SQRT = new CeilSqrt(); // =A003059
  /** Nth prime function. */
  public static final Function1 PRIME = new Prime(); // =A000040
  /** Prime counting function. */
  public static final Function1 PRIME_PI = new PrimePi(); // =A049084 
  /** Next prime function. */
  public static final Function1 NEXT_PRIME = new NextPrime();
  /** Previous prime function. */
  public static final Function1 PREV_PRIME = new PrevPrime();
  /** Factorial. */
  public static final Function1 FACTORIAL = new Factorial(); // =A000142
  /** Primorial, product of all primes up to and including the parameter. */
  public static final Function1 PRIMORIAL = new Primorial(); // =A034386
  /** Factorial base representation. */
  public static final Function1 FACTORIAL_BASE = new FactorialBase(); // =A007623
  /** Product of the specified number of primes. */
  public static final Function1 PRIMORIAL_COUNT = new PrimorialCount();  // =A002110
  /** Fibonacci function. */
  public static final Function1 FIBONACCI = new Fibonacci(); // =A000045
  /** Lucas function. */
  public static final Function1 LUCAS = new Lucas(); // =A000032
  /** Jacobsthal function. */
  public static final Function1 JACOBSTHAL = new Jacobsthal(); // =A001045
  /** Make odd (remove all powers of 2). */
  public static final Function1 MAKE_ODD = new MakeOdd(); // =A000265
  /** Euler totient function. */
  public static final Function1 PHI = new Phi(); // =A000010
  /** Euler co-totient function. */
  public static final Function1 COTOTIENT = new Cototient(); // =A051953
  /** Sum of divisors function. */
  public static final Function1 SIGMA1 = new Sigma1(); // =A000203
  /** Number of divisors function. */
  public static final Function1 SIGMA0 = new Sigma0(); // =A000005
  /** Number of divisors function. */
  public static final Function1 TAU = SIGMA0; // =A000005; Convenient synonym
  /** Number of distinct prime divisors function. */
  public static final Function1 OMEGA = new Omega(); // =A001221
  /** Number of distinct prime divisors counted with multiplicity function. */
  public static final Function1 BIG_OMEGA = new BigOmega(); // =A001222
  /** Sum of distinct prime divisors function. */
  public static final Function1 SOPF = new Sopf(); // =A008472
  /** Sum of prime divisors counted with multiplicity function. */
  public static final Function1 SOPFR = new Sopfr(); // =A001414
  /** The unique square free integer dividing a number. */
  public static final Function1 CORE = new Core(); // =A007913
  /** Mobius function. */
  public static final Function1 MOBIUS = new Mobius(); // =A008683 
  /** Moebius function. */
  public static final Function1 MOEBIUS = MOBIUS; // =A008683
  /** Mertens function. */
  public static final Function1 MERTENS = new Mertens(); // =A002321
  /** Least prime factor. */
  public static final Function1 LPF = new LeastPrimeFactor(); // =A020639
  /** Greatest prime factor. */
  public static final Function1 GPF = new GreatestPrimeFactor(); // =A006530
  /** Square free kernel. */
  public static final Function1 SQUARE_FREE_KERNEL = new SquareFreeKernel(); // =A007947
  /** Square free kernel. */
  public static final Function1 RAD = SQUARE_FREE_KERNEL; // =A007947, convenient synonym
  /** Product of divisors. */
  public static final Function1 POD = new ProductOfDivisors();
  /** Chowla function. */
  public static final Function1 CHOWLA = new Chowla(); // =A048050
  /** Carmichael lambda function. */
  public static final Function1 CARMICHAEL_LAMBDA = new CarmichaelLambda(); // =A002322
  /** Variant of the Carmichael lambda function. */
  public static final Function1 CARMICHAEL_LAMBDA_VARIANT = new CarmichaelLambdaVariant(); // =A011773
  /** Dedekind psi function. */
  public static final Function1 DEDEKIND_PSI = new DedekindPsi(); // =A001615
  /** Bitset indicating which digits are present in a number. */
  public static final Function1 SYNDROME = new Syndrome();
  /** Step to the next number with the same number of set bits. */
  public static final Function1 SWIZZLE = new Swizzle(); // =A057168
  /** Least primitive root of a modulus. */
  public static final Function1 LEAST_PRIMITIVE_ROOT = new LeastPrimitiveRoot(); // =A001918
  /** Triangular numbers. */
  public static final Function1 TRIANGULAR = new Triangular(); // =A000217
  /** Tetrahedral numbers. */
  public static final Function1 TETRAHEDRAL = new Tetrahedral(); // =A000292
  /** Pentagonal numbers. */
  public static final Function1 PENTAGONAL = new Pentagonal(); // =A000326
  /** Hexagonal numbers. */
  public static final Function1 HEXAGONAL = new Hexagonal(); // =A000384
  /** Pyramidal numbers. */
  public static final Function1 PYRAMIDAL = new Pyramidal(); // =A000330
  /** Index of the smallest triangular number greater than or equal to the given number. */
  public static final Function1 TRINV = new TriangularInverse();
  /** Describe the number. For example, 3445, is one 3, two 4s, one 5 to give 132415. */
  public static final Function1 LOOK_AND_SAY = new LookAndSay();
  /** Catalan function. */
  public static final Function1 CATALAN = new Catalan(); // =A000108
  /** Bell numbers. */
  public static final Function1 BELL = new BellNumbers(); // =A000110
  /** Number of partitions. */
  public static final Function1 PARTITIONS = new Partitions(); // =A000041
  /** Next power of two larger than the given number. */
  public static final Function1 NEXT_POWER_OF_2 = new NextPowerOf2(); // =A062383

  // Two argument functions with default first parameter

  // Developer note: SIGMA must be initialized after SIGMA1 and SIGMA0
  /** Generalized sum of divisors function. */
  public static final Function2D SIGMA = new Sigma(); // =A000005(0, =A000203(1,
  /** Multiplicative order in <code>Z_base</code>. */
  public static final Function2D ORDER = new MultiplicativeOrder();
  /** Reverse the digits of a number. */
  public static final Function2D REVERSE = new Reverse(); // =A004086(10, = A305989(2,
  /** Reverse the digits of a number and add the original number. */
  public static final Function2D REVERSE_AND_ADD = new ReverseAndAdd();
  /** Number of digits in a number. */
  public static final Function2D DIGIT_LENGTH = new DigitLength(); // =A055642(10, =A070939(2,
  /** Sum of digits in a number. */
  public static final Function2D DIGIT_SUM =  new DigitSum(); // =A001370(10, = A000120(2,
  /** Sum of the squares of the digits in a number. */
  public static final Function2D DIGIT_SUM_SQUARES = new DigitSumSquares();
  /** Sum of the cubes of the digits in a number. */
  public static final Function2D DIGIT_SUM_CUBES = new DigitSumCubes();
  /** Digit sum root. */
  public static final Function2D DIGIT_SUM_ROOT = new DigitSumRoot();
  /** Product of digits. */
  public static final Function2D DIGIT_PRODUCT = new DigitProduct();
  /** Digit product root. */
  public static final Function2D DIGIT_PRODUCT_ROOT = new DigitProductRoot();
  /** Digit product persistence. */
  public static final Function2D DIGIT_PRODUCT_PERSISTENCE = new DigitProductPersistence();
  /** Product of nonzero digits. */
  public static final Function2D DIGIT_NZ_PRODUCT = new DigitNonzeroProduct(); // =A000012(2, =A117592(3, =A338854(4, =A338803(5, =A338863(6, =A338880(7, =A338881(8, =A338882(9, =A051801(10,
  /** Digit root of nonzero digits. */
  public static final Function2D DIGIT_NZ_PRODUCT_ROOT = new DigitNonzeroProductRoot();
  /** Count of distinct digits. */
  public static final Function2D DISTINCT_DIGIT_COUNT = new DistinctDigitCount(); // =A043537(10, =A043529(2,
  /** Sort the digits of a number into ascending order. */
  public static final Function2D DIGIT_SORT_ASCENDING = new DigitSortAscending();
  /** Sort the digits of a number into descending order. */
  public static final Function2D DIGIT_SORT_DESCENDING = new DigitSortDescending();
  /** Rotate right by one digit. */
  public static final Function2D ROTATE_RIGHT = new RotateRight();
  /** Multifactorial (including double factorial). */
  public static final Function2D MULTIFACTORIAL = new Multifactorial(); // =A006882(2, =A007661(3, =A007662(4, =A085157(5, =A085158(6,
  /** Number of points in a hypersphere of given radius in a given number of dimensions. */
  public static final Function2D HYPERSPHERE_POINTS = new HyperspherePoints();

  // Two argument functions
  /** Valuation function. */
  public static final Function2 VALUATION = new Valuation();
  /** Valuation function. */
  public static final Function2 ORD = VALUATION; // Convenient synonym
  /** Jacobi function. */
  public static final Function2 JACOBI = new Jacobi();


  // Aggregating functions

  /** Minimum of the values. */
  public static final FunctionN MIN = new Min();
  /** Maximum of the values. */
  public static final FunctionN MAX = new Max();
  /** Sum of the values. */
  public static final FunctionN SUM = new Sum();
  /** Product of the values. */
  public static final FunctionN PRODUCT = new Product();

  // Functions supporting both two arguments and aggregation

  /** Greatest common divisor. */
  public static final GreatCommonDivisor GCD = new GreatCommonDivisor();
  /** Least common multiple. */
  public static final LeastCommonMultiple LCM = new LeastCommonMultiple();

  /**
   * Get a function from its name.
   * @param name function name
   * @return the function
   * @throws NoSuchFieldException if the function was not found
   */
  public static Function1 getFunction(final String name) throws NoSuchFieldException {
    try {
      return (Function1) Functions.class.getField(name.toUpperCase(Locale.getDefault())).get(null);
    } catch (final IllegalAccessException e) {
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
