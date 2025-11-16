package irvine.math.z;

import java.math.BigInteger;
import java.util.Random;

import irvine.math.r.DoubleUtils;

/**
 * Test timing of big integer implementations.
 * @author Sean A. Irvine
 */
public final class Timing {

  private Timing() { }

  private static final Random RANDOM = new Random(42); // Deterministic set
  private static final int START_BITS = 30;
  private static final int INCREMENT_FACTOR = 2;
  private static final int VECTOR_LENGTH = 500000000;
  private static final int ITERATIONS = 3;

  private static BigInteger random(final int bits) {
    assert bits > 0;
    final BigInteger min = BigInteger.ONE.shiftLeft(bits - 1);
    return min.or(new BigInteger(bits, RANDOM));
  }

  private static BigInteger[] vector(final int bits) {
    final BigInteger[] res = new BigInteger[VECTOR_LENGTH / bits];
    for (int k = 0; k < res.length; ++k) {
      res[k] = random(bits);
    }
    return res;
  }

  private static Z[] vector(final BigInteger[] n) {
    final Z[] res = new Z[n.length];
    for (int k = 0; k < res.length; ++k) {
      res[k] = Z.valueOf(n[k]);
    }
    return res;
  }

  private static <T extends Number> long[] time(final Operation<T> op, final T[] vector) {
    long sum = 0;
    final long startTime = System.nanoTime();
    for (int k = 1; k < vector.length; k += 2) {
      final T v = op.op(vector[k - 1], vector[k]);
      sum += v.longValue();
    }
    final long endTime = System.nanoTime();
    return new long[] {endTime - startTime, sum};
  }

  private static <T extends Number> long[] time(final Operation<T> op, final T[] vec1, final T[] vec2) {
    long sum = 0;
    final long startTime = System.nanoTime();
    for (int k = 0; k < vec1.length; ++k) {
      final T v = op.op(vec1[k], vec2[k]);
      sum += v.longValue();
    }
    final long endTime = System.nanoTime();
    return new long[] {endTime - startTime, sum};
  }

  private static <T extends Number, S extends Number> long[] time2(final Operation2<T, S> op, final T[] vec1, final S[] vec2) {
    long sum = 0;
    final long startTime = System.nanoTime();
    for (int k = 0; k < vec1.length; ++k) {
      final T v = op.op(vec1[k], vec2[k]);
      sum += v.longValue();
    }
    final long endTime = System.nanoTime();
    return new long[] {endTime - startTime, sum};
  }

  private static void timeTest(final String name, final Operation<BigInteger> op1, final Operation<Z> op2) {
    System.out.println("Timing for: " + name + " bits=" + Z.BASE_BITS);
    for (int k = START_BITS; k <= 1966080; k *= INCREMENT_FACTOR) {
      final BigInteger[] vector = vector(k);
      final Z[] z = vector(vector);
      long totalBigIntegerTime = 0;
      long totalZTime = 0;
      for (int j = 0; j < ITERATIONS; ++j) {
        final long[] timeBigInteger = time(op1, vector);
        final long[] timeZ = time(op2, z);
        if (timeBigInteger[1] != timeZ[1]) {
          System.out.println("Calculation mismatch: " + timeBigInteger[1] + " cf. " + timeZ[1]);
        }
        totalBigIntegerTime += timeBigInteger[0];
        totalZTime += timeZ[0];
      }
      System.out.println(k + " BigInteger=" + totalBigIntegerTime + " Z=" + totalZTime + " r=" + DoubleUtils.NF3.format((double) totalBigIntegerTime / (double) totalZTime));
    }
  }

  // This handle Z.divide(long)
  private static void timeTest2(final String name, final Operation<BigInteger> op1, final Operation2<Z, Long> op2) {
    System.out.println("Timing for: " + name + " bits=" + Z.BASE_BITS);
    for (int k = START_BITS; k <= 1966080; k *= INCREMENT_FACTOR) {
      final BigInteger[] vec1 = vector(k);
      final Z[] z = vector(vec1);
      final BigInteger[] vec3 = new BigInteger[vec1.length];
      final BigInteger mod = BigInteger.valueOf(Z.BASE_MASK);
      for (int j = 0; j < vec1.length; ++j) {
        vec3[j] = vec1[vec1.length - 1 - j].mod(mod);
      }
      final Long[] vec2 = new Long[vec1.length];
      for (int j = 0; j < vec1.length; ++j) {
        vec2[j] = vec3[j].longValue();
      }
      long totalBigIntegerTime = 0;
      long totalZTime = 0;
      for (int j = 0; j < ITERATIONS; ++j) {
        final long[] timeBigInteger = time(op1, vec1, vec3);
        final long[] timeZ = time2(op2, z, vec2);
        if (timeBigInteger[1] != timeZ[1]) {
          System.out.println("Calculation mismatch: " + timeBigInteger[1] + " cf. " + timeZ[1]);
        }
        totalBigIntegerTime += timeBigInteger[0];
        totalZTime += timeZ[0];
      }
      System.out.println(k + " BigInteger=" + totalBigIntegerTime + " Z=" + totalZTime + " r=" + DoubleUtils.NF3.format((double) totalBigIntegerTime / (double) totalZTime));
    }
  }

  private interface Operation<S> {
    /**
     * Application of the operation.
     * @param a first element
     * @param b second element
     * @return <code>a op b</code>
     */
    S op(final S a, final S b);
  }

  private interface Operation2<S, T> {
    /**
     * Application of the operation.
     * @param a first element
     * @param b second element
     * @return <code>a op b</code>
     */
    S op(final S a, final T b);
  }

  /**
   * Run a timing test.
   * @param args ignored
   */
  public static void main(final String... args) {
    switch (args[0]) {
      case "add":
        timeTest("add", BigInteger::add, Z::add);
        break;
      case "subtract":
        timeTest("subtract", BigInteger::subtract, Z::subtract);
        break;
      case "multiply":
        timeTest("multiply", BigInteger::multiply, Z::multiply);
        break;
      case "multiply-long":
        timeTest2("multiply-long", BigInteger::multiply, Z::multiply);
        break;
      case "mod":
        timeTest("mod", BigInteger::mod, Z::mod);
        break;
      case "divide":
        timeTest("divide", BigInteger::divide, Z::divide);
        break;
      case "divide-long":
        timeTest2("divide-long", BigInteger::divide, Z::divide);
        break;
      default:
        throw new RuntimeException("Unknown test: " + args[0]);
    }
  }
}
