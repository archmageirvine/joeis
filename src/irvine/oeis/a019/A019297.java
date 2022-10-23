package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A019297 Integers k such that abs(e^(Pi*sqrt(n)) - k) &lt; 0.01 for some n.
 * @author Sean A. Irvine
 */
public class A019297 extends Sequence0 {

  private static final CR BOUND = CR.valueOf(new Q(1, 100));
  private long mN = -2;

  @Override
  public Z next() {
    while (true) {
      if (++mN == -1) {
        return Z.NEG_ONE; // so we don't have to deal with sqrt(-1)
      }
      final CR z = CR.PI.multiply(CR.valueOf(mN).sqrt()).exp();
      final Z e = z.round();
      if (CR.valueOf(e).subtract(z).abs().compareTo(BOUND) < 0) {
        return e;
      }
    }
  }
}

