package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056142 Concatenate n, floor[n/10], floor[n/100] ... (but do not continue if floor[.]=0).
 * @author Sean A. Irvine
 */
public class A056142 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    sb.append(++mN);
    long t = 10;
    long m;
    while ((m = mN / t) != 0) {
      sb.append(m);
      t *= 10;
    }
    return new Z(sb);
  }
}
