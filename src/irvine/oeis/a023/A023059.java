package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A023059 k and 2k are anagrams in base 4 (written in base 4).
 * @author Sean A. Irvine
 */
public class A023059 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toString(++mN, 4);
      final String t = Long.toString(2 * mN, 4);
      if (ZUtils.syndrome(s).equals(ZUtils.syndrome(t))) {
        return new Z(s);
      }
    }
  }
}
