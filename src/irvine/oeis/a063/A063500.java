package irvine.oeis.a063;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;

/**
 * A063500 a(n) is the least composite solution of phi(k + 6n) = phi(k) + 6n.
 * @author Sean A. Irvine
 */
public class A063500 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 6;
    final Sequence c = new A002808();
    while (true) {
      final Z k = c.next();
      if (Euler.phi(k.add(mN)).equals(Euler.phi(k).add(mN))) {
        return k;
      }
    }
  }
}
