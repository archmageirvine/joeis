package irvine.oeis.a002;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002312 Arc-cotangent reducible numbers or non-St\u00f8rmer numbers: largest prime factor of n^2 + 1 is less than 2n.
 * @author Sean A. Irvine
 */
public class A002312 implements Sequence {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Cheetah.factor(mN.square().add(1));
      final Z lim = mN.multiply2();
      final Z[] f = fs.toZArray();
      boolean ok = true;
      for (int k = f.length - 1; k >= 0; --k) {
        if (f[k].compareTo(lim) >= 0) {
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
