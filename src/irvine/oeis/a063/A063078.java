package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063078 Numbers n such that phi(n)*mu(n) &gt; phi(m)*mu(m) for all m &lt; n.
 * @author Sean A. Irvine
 */
public class A063078 extends Sequence1 {

  private long mN = 0;
  private Z mBest = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      if (Functions.MOBIUS.i(++mN) == 1) {
        final Z phi = Functions.PHI.z(mN);
        if (phi.compareTo(mBest) > 0) {
          mBest = phi;
          return Z.valueOf(mN);
        }
      }
    }
  }
}
