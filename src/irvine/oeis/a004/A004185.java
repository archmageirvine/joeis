package irvine.oeis.a004;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004185 Arrange digits of n in increasing order, then (for n &gt; 0) omit the zeros.
 * @author Sean A. Irvine
 */
public class A004185 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final char[] s = String.valueOf(++mN).toCharArray();
    Arrays.sort(s);
    int k = 0;
    while (k < s.length - 1 && s[k] == '0') {
      ++k;
    }
    return new Z(new String(s, k, s.length - k));
  }
}
