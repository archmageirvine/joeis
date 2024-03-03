package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054263.
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
