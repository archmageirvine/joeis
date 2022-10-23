package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056143 Concatenate ... floor[n/100], floor[n/10], n.
 * @author Sean A. Irvine
 */
public class A056143 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    sb.append(++mN);
    long t = 10;
    long m;
    while ((m = mN / t) != 0) {
      sb.insert(0, m);
      t *= 10;
    }
    return new Z(sb);
  }
}
