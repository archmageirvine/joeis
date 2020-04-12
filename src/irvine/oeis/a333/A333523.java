package irvine.oeis.a333;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A333523 allocated for Daniel Starodubtsev.
 * @author Sean A. Irvine
 */
public class A333523 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z a = Z.valueOf(++mN);
    long k = 0;
    while (true) {
      ++k;
      a = ZUtils.reverse(a).add(a);
      if (a.mod(mN) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
