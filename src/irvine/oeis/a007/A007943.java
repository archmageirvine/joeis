package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007943.
 * @author Sean A. Irvine
 */
public class A007943 implements Sequence {

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
