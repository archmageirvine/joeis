package irvine.oeis.a163;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A163807 Reverse the order of inner digits (all digits but the first and last) of n written in binary. a(n) = the decimal value of the result.
 * @author Georg Fischer
 */
public class A163807 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final String s = Long.toBinaryString(mN);
    final int len = s.length();
    final StringBuilder sb = new StringBuilder(s).reverse();
    if (s.length() > 3) {
      return new Z(s.charAt(0) + sb.substring(1, len - 1) + s.substring(len - 1), 2);
    } else {
      return Z.valueOf(mN);
    }
  }
}
