package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A023069 Numbers n such that n and 3*n are anagrams in base 7 (written in base 7).
 * @author Sean A. Irvine
 */
public class A023069 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toString(++mN, 7);
      final String t = Long.toString(3 * mN, 7);
      if (ZUtils.syndrome(s).equals(ZUtils.syndrome(t))) {
        return new Z(s);
      }
    }
  }
}
