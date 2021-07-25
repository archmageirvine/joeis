package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A023074 Numbers k such that k and 3*k are anagrams in base 8 (written in base 8).
 * @author Sean A. Irvine
 */
public class A023074 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toString(++mN, 8);
      final String t = Long.toString(3 * mN, 8);
      if (ZUtils.syndrome(s).equals(ZUtils.syndrome(t))) {
        return new Z(s);
      }
    }
  }
}
