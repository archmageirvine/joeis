package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006287 Sum of squares of digits of ternary representation of n.
 * @author Sean A. Irvine
 */
public class A006287 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = Long.toString(++mN, 3);
    Z sum = Z.ZERO;
    for (int k = 0; k < s.length(); ++k) {
      final int c = s.charAt(k) - '0';
      sum = sum.add(c * c);
    }
    return sum;
  }
}
