package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.a393.A393283;

/**
 * A392906 allocated for Benjamin W P Cornish.
 * @author Sean A. Irvine
 */
public class A392906 extends A393283 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (int k = 0; k <= mN; ++k) {
      if (mB.get(mN, k).isOdd()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
