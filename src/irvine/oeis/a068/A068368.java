package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A068368 Composite n such that sigma(2n+1)-sigma(n)=n+1.
 * @author Sean A. Irvine
 */
public class A068368 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (Jaguar.factor(c.multiply2().add(1)).sigma().equals(Jaguar.factor(c).sigma().add(c).add(1))) {
        return c;
      }
    }
  }
}

