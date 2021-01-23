package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000224 Number of squares mod n.
 * @author Sean A. Irvine
 */
public class A000224 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z r = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (Z.TWO.equals(p)) {
        r = r.multiply(Z.ONE.shiftLeft(e).divide(6).add(2));
      } else {
        r = r.multiply(p.pow(e + 1).divide(p.multiply2().add(2)).add(1));
      }
    }
    return r;
  }
}

