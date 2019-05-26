package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A023063 Numbers n such that n and <code>4*n</code> are anagrams in base <code>5</code> (written in base <code>5)</code>.
 * @author Sean A. Irvine
 */
public class A023063 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toString(++mN, 5);
      final String t = Long.toString(4 * mN, 5);
      if (ZUtils.syndrome(s).equals(ZUtils.syndrome(t))) {
        return new Z(s);
      }
    }
  }
}
