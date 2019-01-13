package irvine.oeis.a004;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004613.
 * @author Sean A. Irvine
 */
public class A004613 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      boolean ok = true;
      for (final Z p : Cheetah.factor(mN).toZArray()) {
        if (p.mod(4) != 1) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return mN;
      }
    }
  }
}

