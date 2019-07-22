package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a003.A003136;

/**
 * A024679 Positions of primes in <code>A003136</code> (ordered distinct numbers <code>i^2 - i*j + j^2)</code>.
 * @author Sean A. Irvine
 */
public class A024679 extends A003136 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
