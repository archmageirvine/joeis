package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A049501 Major index of n, first definition.
 * @author Sean A. Irvine
 */
public class A049501 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = Long.toBinaryString(++mN);
    long sum = 0;
    for (int k = 0; k < s.length() - 1; ++k) {
      if (s.charAt(k) == '1' && s.charAt(k + 1) == '0') {
        sum += k + 1;
      }
    }
    return Z.valueOf(sum);
  }
}
