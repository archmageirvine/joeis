package irvine.oeis.a085;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085817 Start at (2n+1)/4 and iterate the map x -&gt; x*ceiling(x); sequence gives values of n for which the denominators in the orbit drop directly from 4 to 1, bypassing 2.
 * @author Sean A. Irvine
 */
public class A085817 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      Q x = new Q(2 * ++mN + 1, 4);
      while (x.den().compareTo(Z.TWO) > 0) {
        final boolean wasFour = x.den().equals(Z.FOUR);
        x = x.multiply(x.ceiling());
        if (wasFour && x.den().isOne()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
