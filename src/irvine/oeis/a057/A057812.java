package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A057812 pi(n) is odd.
 * @author Georg Fischer
 */
public class A057812 extends A000720 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isOdd()) {
        return Z.valueOf(mN);
      }
    }
  }
}
