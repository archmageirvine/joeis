package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A023058 Numbers k such that k and 2k are anagrams of each other in base 3 (k is written here in base 3).
 * @author Sean A. Irvine
 */
public class A023058 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toString(++mN, 3);
      final String t = Long.toString(2 * mN, 3);
      if (ZUtils.syndrome(s).equals(ZUtils.syndrome(t))) {
        return new Z(s);
      }
    }
  }
}
