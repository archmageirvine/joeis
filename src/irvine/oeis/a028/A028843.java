package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A028843 Numbers n such that the iterated product of digits of n is a prime.
 * @author Sean A. Irvine
 */
public class A028843 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      long u = ++mN;
      while (u > 9) {
        u = ZUtils.digitProduct(u);
      }
      if (((0b10101100 >>> u) & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
