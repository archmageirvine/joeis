package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007943 Concatenation of sequence (1,3,..,2n-1,2n,2n-2,..,2).
 * @author Sean A. Irvine
 */
public class A007943 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (long k = 1; k < 2 * mN; k += 2) {
      sb.append(k);
    }
    for (long k = 2 * mN; k > 0; k -= 2) {
      sb.append(k);
    }
    return new Z(sb);
  }
}
