package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A015713 Numbers m such that phi(m) * sigma(m) + k^2 is not a square for any k.
 * @author Sean A. Irvine
 */
public class A015713 extends Sequence1 implements Conjectural {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.FOUR.equals(mN)) {
        return Z.FOUR;
      }
      final Z t = mN.isPower();
      if (t != null && (mN.auxiliary() & 1) == 0 && t.mod(4) == 3 && t.isProbablePrime()) {
        return mN;
      }
      if (mN.isEven()) {
        final Z m = mN.divide2();
        if (m.isOdd()) {
          final Z u = m.isPower();
          if (u != null && (m.auxiliary() & 1) == 0 && u.mod(4) == 3 && u.isProbablePrime()) {
            return mN;
          }
        }
      }
    }
  }
}
