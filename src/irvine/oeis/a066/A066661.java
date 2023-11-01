package irvine.oeis.a066;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066661 Numbers m such that floor((1+1/m)^k)=k for an integer k&gt;1.
 * @author Sean A. Irvine
 */
public class A066661 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    final CR nz = CR.valueOf(n);
    long k = nz.log().divide(CR.LOG2).multiply(nz).add(7).floor().longValueExact();
    final Q b = new Q(n + 1, n);
    while (k > 1 && CR.valueOf(b).pow(k).floor().longValueExact() > k) {
      --k;
    }
    return CR.valueOf(b).pow(k).floor().longValueExact() == k;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
