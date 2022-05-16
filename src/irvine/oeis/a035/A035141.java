package irvine.oeis.a035;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002808;

/**
 * A035141 Composite numbers k such that digits in k and in juxtaposition of prime factors of k are the same (apart from multiplicity).
 * @author Sean A. Irvine
 */
public class A035141 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final int syn = ZUtils.syn(c);
      int s = 0;
      for (final Z p : Jaguar.factor(c).toZArray()) {
        s |= ZUtils.syn(p);
      }
      if (s == syn) {
        return c;
      }
    }
  }
}

