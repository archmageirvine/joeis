package irvine.oeis.a165;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A165249 Those positive integers n where the number of <code>1</code>'s, when n is written in binary, on the left half of the binary representation equals the number of <code>1</code>'s on the right half of the binary representation.
 * @author Sean A. Irvine
 */
public class A165249 implements Sequence {

  private long mN = 0;

  private boolean test(final long n) {
    final String s = Long.toBinaryString(n);
    final int len = s.length();
    final int delta = len & 1;
    final int halfLen = len / 2;
    int count = 0;
    for (int k = 0; k < halfLen; ++k) {
      if (s.charAt(k) == '1') {
        ++count;
      }
    }
    for (int k = halfLen + delta; k < len; ++k) {
      if (s.charAt(k) == '1') {
        --count;
      }
    }
    return count == 0;
  }

  @Override
  public Z next() {
    while (!test(++mN)) {
    }
    return Z.valueOf(mN);
  }
}
