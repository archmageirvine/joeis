package irvine.oeis.a063;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063838 Numbers n such that mu(n) + mu(n+1) + mu(n+2) = 3.
 * @author Sean A. Irvine
 */
public class A063849 extends Sequence1 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      if (Mobius.mobius(++mN) + Mobius.mobius(mN + 1) + Mobius.mobius(mN + 2) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
