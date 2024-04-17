package irvine.oeis.a063;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063838 Numbers k such that mu(k) + mu(k+1) + mu(k+2) = 3.
 * @author Sean A. Irvine
 */
public class A063838 extends Sequence1 {

  private long mN = 32;

  @Override
  public Z next() {
    while (true) {
      if (Mobius.mobius(++mN) == 1 && Mobius.mobius(mN + 1) == 1 && Mobius.mobius(mN + 2) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
