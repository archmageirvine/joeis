package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A033170 Positive numbers n such that the set of base 6 digits of n equals the set of base 7 digits of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A033170 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (ZUtils.syn(new Z(Long.toString(++mN, 6))) == ZUtils.syn(new Z(Long.toString(mN, 7)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
