package irvine.oeis.a004;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004144.
 * @author Sean A. Irvine
 */
public class A004144 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.ONE;
    }
    while (true) {
      boolean ok = true;
      for (final Z p : Cheetah.factor(++mN).toZArray()) {
        if (p.mod(4) == 1) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return Z.valueOf(mN);
      }
    }
  }
}
