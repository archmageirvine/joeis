package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000042;

/**
 * A046430 Lengths of repunits with all prime factors ending with the digit 1.
 * @author Sean A. Irvine
 */
public class A046430 extends A000042 {

  private long mN = 0;

  private boolean is(final Z rep) {
    final FactorSequence fs = Jaguar.factor(rep);
    for (final Z p : fs.toZArray()) {
      if (!p.toString().endsWith("1")) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (is(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
