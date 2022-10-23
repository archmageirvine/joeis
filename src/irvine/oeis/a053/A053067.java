package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053067 a(n) is the concatenation of next n numbers (omit leading 0's).
 * @author Sean A. Irvine
 */
public class A053067 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (long k = 0; k < mN; ++k) {
      sb.append(++mM);
    }
    return new Z(sb);
  }
}
