package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065258 Quintal Queens permutation of N: halve or multiply by 3 (mod 5) each digit (0-&gt;0, 1-&gt;3, 2-&gt;1, 3-&gt;4, 4-&gt;2) of the base 5 representation of n-1, add one.
 * @author Sean A. Irvine
 */
public class A065258 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = Long.toString(++mN, 5);
    Z res = Z.ZERO;
    for (int k = 0; k < s.length(); ++k) {
      final long t = s.charAt(k) - '0';
      res = res.multiply(5).add((3 * t) % 5);
    }
    return res.add(1);
  }
}
