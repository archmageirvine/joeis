package irvine.oeis.a066;

import irvine.math.LongUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066969 Numbers k such that Sum_{i=1..k} phi(i)/gcd(k,i) is an integer.
 * @author Sean A. Irvine
 */
public class A066969 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Rationals.SINGLETON.sum(1, ++mN, k -> new Q(Euler.phiAsLong(k), LongUtils.gcd(mN, k))).isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}
