package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076297 Prime(n)+ s*n is prime, s=2.
 * @author Sean A. Irvine
 */
public class A076297 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().add(2 * mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
