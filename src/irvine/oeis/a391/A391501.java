package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a350.A350352;

/**
 * A391501 a(n) is the number of composites k such that radical(k) = sopfr(k) = A350352(n).
 * @author Sean A. Irvine
 */
public class A391501 extends A350352 {

  // After Felix Huber

  private long mC;

  private void s(final Z[] p, final int k, final Z n) {
    if (k == p.length - 1) {
      if (n.mod(p[p.length - 1]).isZero() && p[p.length - 1].compareTo(n) <= 0) {
        ++mC;
      }
    } else {
      for (int e = 1; e <= n.subtract(p.length - k).divide(p[k]).intValueExact(); ++e) {
        s(p, k + 1, n.subtract(p[k].multiply(e)));
      }
    }
  }

  @Override
  public Z next() {
    final Z m = super.next();
    final FactorSequence fs = Jaguar.factor(m);
    final Z[] p = fs.toZArray();
    mC = 0;
    s(p, 0, m);
    return Z.valueOf(mC);
  }
}
