package irvine.oeis.a020;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * A020895 Cubefree sums of two nonzero cubes.
 * @author Sean A. Irvine
 */
public class A020895 extends A020894 {

  private boolean isCubeFree(final Z n) {
    if (Z.ONE.compareTo(n) >= 0) {
      return false;
    }
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      if (fs.getExponent(p) >= 3) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (isCubeFree(t)) {
        return t;
      }
    }
  }
}
