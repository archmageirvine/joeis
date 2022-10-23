package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053443 x^2 + y^2 does not take on all possible values mod n.
 * @author Sean A. Irvine
 */
public class A053443 extends Sequence1 {

  protected long mN = 3;

  @Override
  public Z next() {
    while (true) {
      if ((++mN & 3) == 0) {
        return Z.valueOf(mN);
      }
      final FactorSequence fs = Jaguar.factor(mN);
      for (final Z p : fs.toZArray()) {
        if (p.mod(4) == 3 && fs.getExponent(p) > 1) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

