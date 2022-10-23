package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005823 Numbers whose ternary expansion contains no 1's.
 * @author Sean A. Irvine
 */
public class A005823 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      boolean ok = true;
      while (m != 0) {
        if (m % 3 == 1) {
          ok = false;
          break;
        }
        m /= 3;
      }
      if (ok) {
        return Z.valueOf(mN);
      }
    }
  }
}
