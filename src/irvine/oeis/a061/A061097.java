package irvine.oeis.a061;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061097 a(n) is the concatenation of the phi(n) numbers between 1 and n that are relatively prime to n.
 * @author Sean A. Irvine
 */
public class A061097 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder("1");
    for (long k = 2; k < mN; ++k) {
      if (LongUtils.gcd(k, mN) == 1) {
        sb.append(k);
      }
    }
    return new Z(sb);
  }
}
