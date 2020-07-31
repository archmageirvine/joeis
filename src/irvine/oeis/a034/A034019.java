package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034019 Numbers that are imprimitively (and possibly also primitively) represented by <code>x^2+xy+y^2</code>.
 * @author Sean A. Irvine
 */
public class A034019 implements Sequence {

  private long mN = 3;

  private boolean isA034019(final long n) {
    final FactorSequence fs = Cheetah.factor(n);
    boolean t = false;
    for (final Z p : fs.toZArray()) {
      final long r = p.mod(3);
      if (r < 2 && fs.getExponent(p) > 1) {
        t = true;
      } else if (r == 2) {
        if ((fs.getExponent(p) & 1) == 1) {
          return false;
        }
        t = true;
      }
    }
    return t;
  }

  @Override
  public Z next() {
    while (true) {
      if (isA034019(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
