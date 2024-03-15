package irvine.oeis.a068;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011973.
 * @author Sean A. Irvine
 */
public class A068781 extends Sequence1 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      if (Mobius.mobius(++mN) == 0 && Mobius.mobius(mN + 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
