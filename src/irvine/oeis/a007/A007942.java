package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007942 Decimal concatenation of sequence <code>(n,n-1,</code>..,2,1,2,..,n-1,n).
 * @author Sean A. Irvine
 */
public class A007942 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (long k = mN; k > 0; --k) {
      sb.append(k);
    }
    for (long k = 2; k <= mN; ++k) {
      sb.append(k);
    }
    return new Z(sb);
  }
}
