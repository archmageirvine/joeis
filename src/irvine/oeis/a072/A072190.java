package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A072140.
 * @author Sean A. Irvine
 */
public class A072190 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      if (mN > 1 && ZUtils.isPrimitiveRoot(Z.TWO, p)) {
        return Z.valueOf(mN);
      }
    }
  }
}
