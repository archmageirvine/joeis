package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a010.A010785;

/**
 * A028987 Repdigit - 1 is prime (next term is 88...8 (72 digits)).
 * @author Sean A. Irvine
 */
public class A028987 extends A010785 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.subtract(1).isProbablePrime()) {
        return p;
      }
    }
  }
}
