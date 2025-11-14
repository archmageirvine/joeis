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
  private static final int VECTOR_LENGTH = 20000;

  private static BigInteger random(final int bits) {
    assert bits > 0;
    final BigInteger min = BigInteger.ONE.shiftLeft(bits - 1);
    return min.or(new BigInteger(bits, RANDOM));
  }

  private static BigInteger[] vector(final int bits) {
    final BigInteger[] res = new BigInteger[VECTOR_LENGTH];
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
    for (int k = 0; k < vector.length; k += 2) {
      final T v = op.op(vector[k], vector[k + 1]);
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

  private static void timeTest(final Operation<BigInteger> op1, final Operation<Z> op2) {
    for (int k = START_BITS; k <= 1966080; k *= INCREMENT_FACTOR) {
      final BigInteger[] vector = vector(k);
      final long[] timeBigInteger = time(op1, vector);
      final Z[] z = vector(vector);
      final long[] timeZ = time(op2, z);
      if (timeBigInteger[1] != timeZ[1]) {
        System.out.println("Calculation mismatch: " + timeBigInteger[1] + " cf. " + timeZ[1]);
      }
      System.out.println(k + " BigInteger=" + timeBigInteger[0] + " Z=" + timeZ[0] + " r=" + DoubleUtils.NF3.format((double) timeBigInteger[0] / (double) timeZ[0]));
    }
  }

  // This handle Z.divide(long)
  private static void timeTest2(final Operation<BigInteger> op1, final Operation2<Z, Long> op2) {
    for (int k = START_BITS; k <= 1966080; k *= INCREMENT_FACTOR) {
      final BigInteger[] vec1 = vector(k);
      final BigInteger[] vec3 = new BigInteger[vec1.length];
      final BigInteger mod = BigInteger.valueOf(Z.BASE_MASK);
      for (int j = 0; j < vec1.length; ++j) {
        vec3[j] = vec1[vec1.length - 1 - j].mod(mod);
      }
      final Long[] vec2 = new Long[vec1.length];
      for (int j = 0; j < vec1.length; ++j) {
        vec2[j] = vec3[j].longValue();
      }
      final long[] timeBigInteger = time(op1, vec1, vec3);
      final Z[] z = vector(vec1);
      final long[] timeZ = time2(op2, z, vec2);
      if (timeBigInteger[1] != timeZ[1]) {
        System.out.println("Calculation mismatch: " + timeBigInteger[1] + " cf. " + timeZ[1]);
      }
      System.out.println(k + " BigInteger=" + timeBigInteger[0] + " Z=" + timeZ[0] + " r=" + DoubleUtils.NF3.format((double) timeBigInteger[0] / (double) timeZ[0]));
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
    //timeTest(BigInteger::add, Z::add);
    timeTest(BigInteger::subtract, Z::subtract);
    //timeTest(BigInteger::multiply, Z::multiply);
    //timeTest(BigInteger::mod, Z::mod);
    //timeTest(BigInteger::divide, Z::divide);
    //timeTest2(BigInteger::divide, Z::divide);
  }
}
