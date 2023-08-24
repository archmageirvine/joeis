package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065257 Quintal Queens permutation of N: double (mod 5) each digit (0-&gt;0, 1-&gt;2, 2-&gt;4, 3-&gt;1, 4-&gt;3) of the base-5 representation of n-1, add one.
 * @author Sean A. Irvine
 */
public class A065257 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = Long.toString(++mN, 5);
    Z res = Z.ZERO;
    for (int k = 0; k < s.length(); ++k) {
      final long t = s.charAt(k) - '0';
      res = res.multiply(5).add((2 * t) % 5);
    }
    return res.add(1);
  }
}
