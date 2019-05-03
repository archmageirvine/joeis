package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000118 Number of ways of writing n as a sum of 4 squares; also theta series of lattice <code>Z^4</code>.
 * @author Sean A. Irvine
 */
public class A000118 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final FactorSequence fs = Cheetah.factor(mN);
    Z r = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (Z.TWO.equals(p)) {
        r = r.multiply(3);
      } else {
        Z s = Z.ONE;
        Z d = Z.ONE;
        for (int k = 0; k < e; ++k) {
          d = d.multiply(p);
          s = s.add(d);
        }
        r = r.multiply(s);
      }
    }
    return r.shiftLeft(3);
  }
}

