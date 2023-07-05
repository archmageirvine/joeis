package irvine.oeis.a035;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002808;

/**
 * A035140 Digits of juxtaposition of prime factors of composite n appear also in n.
 * @author Sean A. Irvine
 */
public class A035140 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final int syn = ZUtils.syn(c);
      int s = 0;
      for (final Z p : Jaguar.factor(c).toZArray()) {
        s |= ZUtils.syn(p);
      }
      if ((s | syn) == syn) {
        return c;
      }
    }
  }
}

