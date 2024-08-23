package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a050.A050278;

/**
 * A071926 Least m such that m-th pandigital A050278(m) is a multiple of n or -1 if no such m exists.
 * @author Sean A. Irvine
 */
public class A071926 extends Sequence1 {

  private long mN;

  @Override
  public Z next() {
    if (++mN > 9876543210L) {
      return Z.NEG_ONE;
    }
    long m = 0;
    final Sequence pandigital = new A050278();
    while (true) {
      ++m;
      final Z p = pandigital.next();
      if (p == null) {
        return Z.NEG_ONE;
      }
      if (p.mod(mN) == 0) {
        return Z.valueOf(m);
      }
    }
  }
}
