package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053062 Concatenate n, 2n, 3n, ... nn.
 * @author Sean A. Irvine
 */
public class A053062 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (long k = 1; k <= mN; ++k) {
      sb.append(k * mN);
    }
    return new Z(sb);
  }
}
