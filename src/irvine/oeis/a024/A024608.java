package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a003.A003136;

/**
 * A024608 Positions of even numbers in <code>A003136</code>.
 * @author Sean A. Irvine
 */
public class A024608 extends A003136 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isEven()) {
        return Z.valueOf(mN);
      }
    }
  }
}
