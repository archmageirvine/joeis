package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

import java.math.BigInteger;

import org.apfloat.Apfloat;
import org.apfloat.ApfloatMath;

/**
 * A000691.
 * @author Sean A. Irvine
 */
public class A000691 implements Sequence {

  private static final int PRECISION = 500;
  private static final int TERMS = 5000;
  private static final Apfloat TWO = new Apfloat(2, PRECISION);
  private static final Apfloat LN2 = ApfloatMath.log(TWO);
  private static final Apfloat HALF = new Apfloat("0.5", PRECISION);
  private static final Apfloat TOLERANCE = new Apfloat(0.00001);
  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();
  private static final Apfloat B = new Apfloat(A000690.C0.substring(0, PRECISION));

  /**
   * Compute an approximation to the integral <code>int_1^(2^k) du/sqrt(ln(u))</code>.
   * Uses the series <code>sum_{m=1}^infty (2/(2m-1)(m-1)!)(k*ln(2))^((2m-1)/2)</code>.
   *
   * @param k parameter
   * @return approximate integral
   */
  static Apfloat sqrtLnInt(final int k) {
    final Apfloat a = LN2.multiply(new Apfloat(k));
    Apfloat sum = Apfloat.ZERO;
    for (int m = 1; m < TERMS; ++m) {
      final Apfloat old = sum;
      final int n = 2 * m - 1;
      final BigInteger den = FACTORIAL.factorial(m - 1).multiply(n).bigIntegerValue();
      final Apfloat t = ApfloatMath.pow(ApfloatMath.sqrt(a), n).multiply(TWO.divide(new Apfloat(den)));
      sum = sum.add(t);
      if (sum.subtract(old).compareTo(TOLERANCE) < 0) {
        // Early exit if we are confident things wont change much
        break;
      }
    }
    return sum;
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Apfloat u = sqrtLnInt(mN);
    return Z.valueOf(u.multiply(B).add(HALF).truncate().toBigInteger());
  }
}



