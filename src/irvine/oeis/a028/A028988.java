package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a010.A010785;

/**
 * A028988 Repdigit <code>+ 1</code> is prime.
 * @author Sean A. Irvine
 */
public class A028988 extends A010785 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(1).isProbablePrime()) {
        return p;
      }
    }
  }
}
