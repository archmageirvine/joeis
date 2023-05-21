package irvine.oeis.a063;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063838 Numbers n such that mu(n) + mu(n+1) + mu(n+2) = 3.
 * @author Sean A. Irvine
 */
public class A063848 extends Sequence1 {

  private long mN = 13;

  @Override
  public Z next() {
    while (true) {
      if (Mobius.mobius(++mN) + Mobius.mobius(mN + 1) + Mobius.mobius(mN + 2) == 2) {
        return Z.valueOf(mN);
      }
    }
  }
}
