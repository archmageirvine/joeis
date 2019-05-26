package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A023091.
 * @author Sean A. Irvine
 */
public class A023091 implements Sequence {

  private long mN = -3;

  @Override
  public Z next() {
    while (true) {
      mN += 3;
      final String s = Long.toString(mN);
      final String t = Long.toString(7 * mN);
      if (ZUtils.syndrome(s).equals(ZUtils.syndrome(t))) {
        return new Z(s);
      }
    }
  }
}
