package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a028.A028982;

/**
 * A063680 Solutions to sigma(k) + 7 = sigma(k+7).
 * @author Sean A. Irvine
 */
public class A063680 extends A028982 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Z s = Jaguar.factor(t).sigma();
      if (Jaguar.factor(t.add(7)).sigma().equals(s.add(7))) {
        return t;
      }
      if (Jaguar.factor(t.subtract(7)).sigma().add(7).equals(s) && t.compareTo(Z.SEVEN) > 0) {
        return t.subtract(7);
      }
    }
  }
}
