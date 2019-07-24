package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000408;

/**
 * A024798 Positions of even numbers in <code>A000408</code>.
 * @author Sean A. Irvine
 */
public class A024798 extends A000408 {

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
