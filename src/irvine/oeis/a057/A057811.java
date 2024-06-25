package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A057811 Numbers k such that pi(k) is even.
 * @author Georg Fischer
 */
public class A057811 extends A000720 {

  private int mN = 0;

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
