package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A023073 k and <code>2k</code> are anagrams in base <code>8</code> (written in base <code>8)</code>.
 * @author Sean A. Irvine
 */
public class A023073 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toString(++mN, 8);
      final String t = Long.toString(2 * mN, 8);
      if (ZUtils.syndrome(s).equals(ZUtils.syndrome(t))) {
        return new Z(s);
      }
    }
  }
}
