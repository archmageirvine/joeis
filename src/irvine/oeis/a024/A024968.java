package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a003.A003072;

/**
 * A024968 Positions of even numbers in <code>A003072</code>.
 * @author Sean A. Irvine
 */
public class A024968 extends A003072 {

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
