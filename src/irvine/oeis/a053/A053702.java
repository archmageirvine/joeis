package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a025.A025475;

/**
 * A053702 Odd prime powers p^w (w&gt;1) such that p^w+2 is prime.
 * @author Sean A. Irvine
 */
public class A053702 extends A025475 {

  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (a.add(2).isProbablePrime()) {
        return a;
      }
    }
  }
}
