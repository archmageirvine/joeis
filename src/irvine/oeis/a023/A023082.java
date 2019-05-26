package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A023082 Numbers n such that n and <code>5*n</code> are anagrams in base <code>9</code> (written in base <code>9)</code>.
 * @author Sean A. Irvine
 */
public class A023082 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toString(++mN, 9);
      final String t = Long.toString(5 * mN, 9);
      if (ZUtils.syndrome(s).equals(ZUtils.syndrome(t))) {
        return new Z(s);
      }
    }
  }
}
