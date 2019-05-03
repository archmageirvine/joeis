package irvine.oeis.a165;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A165789 <code>a(n) =</code> the smallest positive integer k that when written in binary, and leading <code>0</code>'s of k are ignored, contains the reversal of the digits of binary n.
 * @author Sean A. Irvine
 */
public class A165789 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final String s = new StringBuilder(Long.toBinaryString(++mN)).reverse().toString();
    long k = 1;
    while (!Long.toBinaryString(k).contains(s)) {
      ++k;
    }
    return Z.valueOf(k);
  }
}

