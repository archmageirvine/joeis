package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A028845 Iterated product of digits of n is a nonzero square.
 * @author Sean A. Irvine
 */
public class A028845 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long u = ++mN;
      while (u > 9) {
        u = ZUtils.digitProduct(u);
      }
      if (((0b1000010010 >>> u) & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
