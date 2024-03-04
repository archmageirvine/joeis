package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068657 Successive left concatenation of floor(k/2) beginning with n until we reach 1.
 * @author Sean A. Irvine
 */
public class A068657 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    final StringBuilder sb = new StringBuilder();
    do {
      sb.append(m);
      m /= 2;
    } while (m >= 1);
    return new Z(sb);
  }
}
