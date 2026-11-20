package irvine.oeis.a087;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087484 Least hypotenuse of a primitive Pythagorean triangle with inradius n.
 * @author Sean A. Irvine
 */
public class A087484 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final Z[] p = fs.toZArray();
    final List<Z> ys = new ArrayList<>();
    for (long s = 1L; s <= 1L << p.length; ++s) {
      Z v = Z.ONE;
      for (int k = 0; k < p.length; ++k) {
        if ((s & (1L << k)) != 0) {
          v = v.multiply(p[k].pow(fs.getExponent(p[k])));
        }
      }
      if ((mN & 1) == 1 || ((mN / v.longValueExact()) & 1) == 1) {
        ys.add(v);
      }
    }
    Z minY = null;
    Z minP = null;
    for (final Z y : ys) {
      final Z pv = y.square().multiply(4).add(6 * mN).add(Z.valueOf(2 * mN * mN).divide(y.square()));
      if (minP == null || pv.compareTo(minP) < 0) {
        minP = pv;
        minY = y;
      }
    }
    final Z x = minY.add(mN / minY.longValueExact());
    return x.square().add(minY.square());
  }
}
