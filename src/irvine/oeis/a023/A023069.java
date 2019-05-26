package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A023069 Numbers n such that n and <code>3*n</code> are anagrams in base <code>7</code> (written in base <code>7)</code>.
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
