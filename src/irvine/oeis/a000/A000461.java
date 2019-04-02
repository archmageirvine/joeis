package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000461 Concatenate n n times.
 * @author Sean A. Irvine
 */
public class A000461 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    sb.append(mN);
    // use doublings for most of it
    int q = 2;
    while (q <= mN) {
      sb.append(sb);
      q <<= 1;
    }
    // and do whatever is left over
    for (int k = q >>> 1; k < mN; ++k) {
      sb.append(mN);
    }
    return new Z(sb);
  }
}
