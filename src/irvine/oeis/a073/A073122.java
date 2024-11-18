package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073122 Minimal reversing binary representation of n. Converting sum of powers of 2 in binary representation of a(n) to alternating sum gives n. See A072339.
 * @author Sean A. Irvine
 */
public class A073122 extends Sequence1 {

  private long mN = 0;

  private boolean isRestZero(final String s, final int pos) {
    for (int k = pos; k < s.length(); ++k) {
      if (s.charAt(k) != '0') {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final String s = Long.toBinaryString(++mN);
    long sum = 0;
    for (int k = 0; k < s.length(); ++k) {
      if (s.charAt(k) == '1') {
        int j = k + 1;
        while (j < s.length() && s.charAt(j) == '1') {
          ++j;
        }
        if (j == k + 1 && isRestZero(s, j)) {
          sum += 1L << (s.length() - j);
        } else {
          sum += 1L << (s.length() - k);
          sum += 1L << (s.length() - j);
        }
        k = j;
      }
    }
    return Z.valueOf(sum);
  }
}
