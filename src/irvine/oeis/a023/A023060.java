package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A023060 Numbers n such that n and 3*n are anagrams in base 4 (written in base 4).
 * @author Sean A. Irvine
 */
public class A023060 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toString(++mN, 4);
      final String t = Long.toString(3 * mN, 4);
      if (ZUtils.syndrome(s).equals(ZUtils.syndrome(t))) {
        return new Z(s);
      }
    }
  }
}
