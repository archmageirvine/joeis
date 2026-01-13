package irvine.oeis.a083;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A083163 Define a function f(k) by f(k) = (k*a*b*c...)/(d*e*f...), where a,b,c,...are those nonzero digits of k which do not divide k and d,e,f,... are those nonzero digits of k which divide k. a(n) = Floor[f(k)].
 * @author Sean A. Irvine
 */
public class A083163 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final int[] counts = ZUtils.digitCounts(++mN);
    Q t = Q.valueOf(mN);
    for (int k = 1; k < counts.length; ++k) {
      if (counts[k] != 0) {
        final Z v = Z.valueOf(k).pow(counts[k]);
        if (mN % k == 0) {
          t = t.divide(v);
        } else {
          t = t.multiply(v);
        }
      }
    }
    return t.floor();
  }
}

