package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000404.
 * @author Sean A. Irvine
 */
public class A000404 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Cheetah.factor(mN);
      boolean check = false;
      for (final Z f : fs.toZArray()) {
        final long r = f.mod(4);
        if (r == 3) {
          if ((fs.getExponent(f) & 1) == 1) {
            check = false;
            break;
          }
        } else {
          if (r == 1) {
            check = true;
          } else {
            assert Z.TWO.equals(f);
            check |= (fs.getExponent(Z.TWO) & 1) == 1;
          }
        }
      }
      if (check) {
        return mN;
      }
    }
  }
}

