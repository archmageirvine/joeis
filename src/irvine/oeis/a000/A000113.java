package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000113 Number of transformation groups of order n.
 * @author Sean A. Irvine
 */
public class A000113 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final FactorSequence fs = Jaguar.factor(mN);
    Z r = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (Z.TWO.equals(p)) {
        final int shift = e < 7 ? (e - 1) / 2 : e - 4;
        r = r.shiftLeft(shift).multiply(3);
      } else if (Z.THREE.equals(p)) {
        if (e < 3) {
          r = r.shiftLeft(2);
        } else {
          r = r.shiftLeft(2).multiply(Z.THREE.pow(e - 2));
        }
      } else {
        r = r.multiply(p.add(1)).multiply(p.pow(e - 1));
      }
    }
    return r;
  }
}

