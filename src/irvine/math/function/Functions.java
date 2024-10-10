package irvine.math.function;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

import irvine.math.z.Z;

/**
 * Convenience class collecting together available functions.
 * The comments of the form "// =A-number" are evaluated automatically by the generator.
 * @author Sean A. Irvine
 */
public final class Functions {

  private Functions() { }

  // WARNING: There is a certain amount of trickiness here:
  // The order in which these functions are initialized matters.

  // One argument functions

  // SQRT must be initialized before PRIME
  /** Floor square root (truncating square root). */
  public static final Function1 SQRT = new Sqrt(); // =A000196
  /** Ceiling square root. */
  public static final Function1 CEIL_SQRT = new CeilSqrt(); // =A003059
  /** Floor cube root (truncating cube root). */
  public static final Function1 CBRT = new CubeRoot(); // =A048766
  /** Ceiling cube root. */
  public static final Function1 CEIL_CBRT = new CeilCubeRoot();
  /** Nth prime function. */
  public static final Function1 PRIME = new Prime(); // =A000040
  /** Prime counting function. */
  public static final Function1 PRIME_PI = new PrimePi(); // =A049084, =A000720
  /** Next prime function. */
  public static final Function1 NEXT_PRIME = new NextPrime(); // =A007918, =A151800
  /** Previous prime function. */
  public static final Function1 PREV_PRIME = new PrevPrime(); // =A007919, =A151799
  /** Factorial. */
  public static final Function1 FACTORIAL = new Factorial(); // =A000142
  /** Primorial, product of all primes up to and including the parameter. */
  public static final Function1 PRIMORIAL = new Primorial(); // =A034386
  /** Superfactorial (product of factorials). */
  public static final Function1 SUPERFACTORIAL = new Superfactorial(); // =A000178
  /** Factorial base representation. */
  public static final Function1 FACTORIAL_BASE = new FactorialBase(); // =A007623
  /** Primorial base representation. */
  public static final Function1 PRIMORIAL_BASE = new PrimorialBase(); // =A049345
  /** Primorial base log representation. */
  public static final Function1 PRIMORIAL_BASE_LOG = new PrimorialBaseLog(); // =A276085
  /** Primorial base exp representation. */
  public static final Function1 PRIMORIAL_BASE_EXP = new PrimorialBaseExp(); // =A276086
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
  /** Parity (0 for even, 1 for odd). */
  public static final Function1 PARITY = new Parity(); // =A000035
  /** Euler totient function. */
  public static final Function1 PHI = new Phi(); // =A000010
  /** Euler co-totient function. */
  public static final Function1 COTOTIENT = new Cototient(); // =A051953
  /** Sum of divisors function. */
  public static final Function1 SIGMA1 = new Sigma1(); // =A000203
  /** Number of divisors function. */
  public static final Function1 SIGMA0 = new Sigma0(); // =A000005
  /** Number of divisors function, convenient synonym. */
  public static final Function1 TAU = SIGMA0; // =A000005
  /** Number of unitary divisors function. */
  public static final Function1 USIGMA0 = new UnitarySigma0(); // =A034444
  /** Sum of unitary divisors function. */
  public static final Function1 USIGMA1 = new UnitarySigma(); // =A034448
  /** Sum of the numbers less than n that do not divide n. */
  public static final Function1 ANTISIGMA = new Antisigma(); // =A024816
  /** Unitary phi function. */
  public static final Function1 UPHI = new UnitaryPhi(); // =A047994
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
  /** Square free kernel, convenient synonym. */
  public static final Function1 RAD = SQUARE_FREE_KERNEL; // =A007947
  /** Product of divisors. */
  public static final Function1 POD = new ProductOfDivisors(); //=A007955
  /** Chowla function. */
  public static final Function1 CHOWLA = new Chowla(); // =A048050
  /** Arithmetic derivative. */
  public static final Function1 ARD = new ArithmeticDerivative(); // =A003415
  /** Liouville lambda function. */
  public static final Function1 LIOUVILLE_LAMBDA = new LiouvilleLambda(); // =A008836
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
  /** Number of partitions into distinct parts. */
  public static final Function1 DISTINCT_PARTITIONS = new DistinctPartsPartitions(); // =A000009
  /** Next power of two larger than the given number. */
  public static final Function1 NEXT_POWER_OF_2 = new NextPowerOf2(); // =A062383
  /** Gray encoding of a number. */
  public static final Function1 GRAY_ENCODE = new GrayEncode(); // =A003188
  /** Gray decoding of a number. */
  public static final Function1 GRAY_DECODE = new GrayDecode(); // =A006068
  /** Thue Morse sequence. */
  public static final Function1 THUE_MORSE = new ThueMorse(); // =A010060

  // Two argument functions with default first parameter

  // Developer note: SIGMA must be initialized after SIGMA1 and SIGMA0
  /** Generalized sum of divisors function. */
  public static final Function2D SIGMA = new Sigma(); // =A000005(0, =A000203(1, =A001157(2, =A001158(3,
  /** Multiplicative order in <code>Z_base</code>. */
  public static final Function2D ORDER = new MultiplicativeOrder();
  /** Reverse the digits of a number. */
  public static final Function2D REVERSE = new Reverse(); // =A004086(10, = A305989(2,
  /** Reverse the digits of a number and add the original number. */
  public static final Function2D REVERSE_AND_ADD = new ReverseAndAdd();
  /** Leading (first, initial, most significant digit) of a number. */
  public static final Function2D LEADING_DIGIT = new LeadingDigit(); // =A000030(10, =A057427(2, =A122586(3, =A122587(4, =A339255(5, =A339256(6,
  /** Number of digits in a number. */
  public static final Function2D DIGIT_LENGTH = new DigitLength(); // =A055642(10, =A070939(2,
  /** Sum of digits in a number. */
  public static final Function2D DIGIT_SUM = new DigitSum(); // =A001370(10, =A007953(10, =A000120(2, =A053735(3,
  /** Sum of the squares of the digits in a number. */
  public static final Function2D DIGIT_SUM_SQUARES = new DigitSumSquares(); // =A003132(10,
  /** Sum of the cubes of the digits in a number. */
  public static final Function2D DIGIT_SUM_CUBES = new DigitSumCubes(); // =A055012(10,
  /** Digit sum root. */
  public static final Function2D DIGIT_SUM_ROOT = new DigitSumRoot(); // =A010888(10,
  /** Product of digits. */
  public static final Function2D DIGIT_PRODUCT = new DigitProduct(); // =A007954(10,
  /** Digit product root. */
  public static final Function2D DIGIT_PRODUCT_ROOT = new DigitProductRoot(); // =A031347(10,
  /** Digit product persistence. */
  public static final Function2D DIGIT_PRODUCT_PERSISTENCE = new DigitProductPersistence(); // =A031346(10,
  /** Product of nonzero digits. */
  public static final Function2D DIGIT_NZ_PRODUCT = new DigitNonzeroProduct(); // =A000012(2, =A117592(3, =A338854(4, =A338803(5, =A338863(6, =A338880(7, =A338881(8, =A338882(9, =A051801(10,
  /** Digit root of nonzero digits. */
  public static final Function2D DIGIT_NZ_PRODUCT_ROOT = new DigitNonzeroProductRoot(); // =A051802(10,
  /** Count of distinct digits. */
  public static final Function2D DISTINCT_DIGIT_COUNT = new DistinctDigitCount(); // =A043537(10, =A043529(2,
  /** Sort the digits of a number into ascending order. */
  public static final Function2D DIGIT_SORT_ASCENDING = new DigitSortAscending(); // =A004185(10,
  /** Sort the digits of a number into descending order. */
  public static final Function2D DIGIT_SORT_DESCENDING = new DigitSortDescending(); // =A004186(10,
  /** Minimum digit in a number. */
  public static final Function2D DIGIT_MIN = new DigitMin();
  /** Maximum digit in a number. */
  public static final Function2D DIGIT_MAX = new DigitMax();
  /** Rotate right by one digit. */
  public static final Function2D ROTATE_RIGHT = new RotateRight();
  /** Multifactorial (including double factorial). */
  public static final Function2D MULTIFACTORIAL = new Multifactorial(); // =A006882(2, =A007661(3, =A007662(4, =A085157(5, =A085158(6,
  /** Number of points in a hypersphere of given radius in a given number of dimensions. */
  public static final Function2D HYPERSPHERE_POINTS = new HyperspherePoints();

  // Two argument functions
  /** Valuation function. */
  public static final Function2 VALUATION = new Valuation();
  /** Jacobi symbol. */
  public static final Function2 JACOBI = new Jacobi();
  /** Kronecker symbol. */
  public static final Function2 KRONECKER = new Kronecker();
  /** Pochhammer symbol. */
  public static final Function2 POCHHAMMER = new Pochhammer();
  /** Falling factorial function. */
  public static final Function2 FALLING_FACTORIAL = new FallingFactorial(); // =A008279
  /** Stirling numbers of the first kind. */
  public static final Function2 STIRLING1 = new Stirling1(); // =A008275
  /** Stirling numbers of the second kind. */
  public static final Function2 STIRLING2 = new Stirling2(); // =A008277
  /** Associated Stirling numbers of the first kind. */
  public static final Function2 ASSOCIATED_STIRLING1 = new AssociatedStirling1(); // =A000276, =A008306
  /** Cantor&apos;s pairing function (0-based) */
  public static final Function2 CANTOR_PAIRING = new CantorPairing();
  /** One-based pairing function (Hopcroft and Ullman) */
  public static final Function2 ONE_BASED_PAIRING = new OneBasedPairing();
  /** Eulerian numbers of the second kind. */
  public static final Function2 EULERIAN2 = new Eulerian2();
  /** Cyclotomic function. */
  public static final Function2 CYCLOTOMIC = new Cyclotomic();
  /** Lah numbers. */
  public static final Function2 LAH = new Lah(); // =A008297


  // Aggregating functions

  /** Minimum of the values. */
  public static final FunctionN MIN = new Min(); // =A003983
  /** Maximum of the values. */
  public static final FunctionN MAX = new Max(); // =A051125
  /** Sum of the values. */
  public static final FunctionN SUM = new Sum(); // =A051162, =A108872
  /** Product of the values. */
  public static final FunctionN PRODUCT = new Product(); // =A075362, =A079904

  // Functions supporting both two arguments and aggregation

  /** Greatest common divisor. */
  public static final GreatCommonDivisor GCD = new GreatCommonDivisor(); // =A050873
  /** Least common multiple. */
  public static final LeastCommonMultiple LCM = new LeastCommonMultiple(); // =A051173


  /**
   * Create an arbitrary one argument function over the integers defined by a lambda.
   * @param lambda function lambda
   * @return function
   */
  public static Function1 create(final Function<Z, Z> lambda) {
    return new FunctionLambda1(lambda);
  }

  /**
   * Create an arbitrary two argument function over the integers defined by a lambda.
   * @param lambda function lambda
   * @return function
   */
  public static Function2 create(final BiFunction<Z, Z, Z> lambda) {
    return new FunctionLambda2(lambda);
  }

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
