package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A023090.
 * @author Sean A. Irvine
 */
public class A023090 implements Sequence {

  private long mN = -9;

  @Override
  public Z next() {
    while (true) {
      mN += 9;
      final String s = Long.toString(mN);
      final String t = Long.toString(6 * mN);
      if (ZUtils.syndrome(s).equals(ZUtils.syndrome(t))) {
        return new Z(s);
      }
    }
  }
}
