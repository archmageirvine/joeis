package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a004.A004432;

/**
 * A024806 Positions of even numbers in <code>A004432</code>.
 * @author Sean A. Irvine
 */
public class A024806 extends A004432 {

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
