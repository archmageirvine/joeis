package irvine.oeis.a003;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003681 <code>a(n) =</code> min { p <code>+-</code> q : p <code>+-</code> q <code>&gt; 1</code> and p*q <code>= Product_{k=1..n-1} a(k) }</code>.
 * @author Sean A. Irvine
 */
public class A003681 implements Sequence {

  private final FactorSequence mFS = new FactorSequence(); // Accumulates factorization
  private Z mProd = Z.ONE; // Accumulates terms (saves multiplying out mFS)

  // The following is derived from the implementation in FactorSequence, but retains only
  // the divisors closest to the "middle" which are needed for this sequence.
  private Z[] centralDivisors(final Z sqrt) {
    final Z[] p = mFS.toZArray();
    final int[] limits = new int[p.length];
    for (int k = 0; k < p.length; ++k) {
      limits[k] = mFS.getExponent(p[k]);
    }
    final Z[] res = new Z[2];
    Arrays.fill(res, Z.ONE);
    final Z[] deltas = new Z[2];
    Arrays.fill(deltas, sqrt);
    final int[] e = new int[p.length];
    for (long k = 1; k < mFS.sigma0AsLong(); ++k) {
      int j = p.length - 1;
      while (++e[j] > limits[j]) {
        e[j--] = 0;
      }
      Z m = Z.ONE;
      for (int i = 0; i < p.length; ++i) {
        if (e[i] != 0) {
          m = m.multiply(p[i].pow(e[i]));
        }
      }
      final Z delta = sqrt.subtract(m);
      if (delta.signum() > 0) {
        if (delta.compareTo(deltas[0]) < 0) {
          if (delta.compareTo(deltas[1]) < 0) {
            deltas[0] = deltas[1];
            res[0] = res[1];
            deltas[1] = delta;
            res[1] = m;
          } else {
            deltas[0] = delta;
            res[0] = m;
          }
        }
      }
    }
    return res;
  }

  @Override
  public Z next() {
    final Z t;
    if (mProd.equals(Z.ONE)) {
      t = Z.TWO;
    } else if (mProd.equals(Z.TWO)) {
      t = Z.THREE;
    } else {
      final Z[] divisors = centralDivisors(mProd.sqrt());
      final Z a = divisors[1];
      final Z b = mProd.divide(a);
      final Z d1 = b.subtract(a);
      if (Z.ONE.equals(d1)) {
        final Z x = divisors[0];
        final Z y = mProd.divide(x);
        t = y.subtract(x);
      } else {
        t = d1;
      }
    }
    mProd = mProd.multiply(t);
    final FactorSequence fs = Jaguar.factor(t);
    mFS.merge(fs);
    return t;
  }
}
