package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002025;
import irvine.oeis.a007.A007770;

/**
 * A066867.
 * @author Sean A. Irvine
 */
public class A066870 extends A007770 {

  private final Sequence mA = new A002025();
  private Z mU = null;

  private static Z aliquot(final Z n) {
    return Jaguar.factor(n).sigma().subtract(n);
  }

  @Override
  public Z next() {
    if (mU != null) {
      final Z t = mU;
      mU = null;
      return t;
    }
    while (true) {
      final Z t = mA.next();
      if (isHappy(t)) {
        final Z u = aliquot(t);
        if (isHappy(u)) {
          mU = u;
          return t;
        }
      }
    }
  }
}
