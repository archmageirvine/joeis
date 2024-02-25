package irvine.oeis.a068;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068588 Treated as strings, n and its reversal are substrings of 2^n.
 * @author Sean A. Irvine
 */
public class A068588 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final String s = Z.ONE.shiftLeft(++mN).toString();
      if (s.contains(String.valueOf(mN)) && s.contains(String.valueOf(LongUtils.reverse(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
