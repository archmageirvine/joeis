package irvine.oeis.a165;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A165153 a(n) = the product of all distinct positive (nonzero) integers that, when written in binary, occur as substrings in the binary representation of n.
 * @author Sean A. Irvine
 */
public class A165153 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final String n = Long.toBinaryString(++mN);
    Z p = Z.valueOf(mN);
    for (long k = 2; k < mN; ++k) {
      if (n.contains(Long.toBinaryString(k))) {
        p = p.multiply(k);
      }
    }
    return p;
  }
}
