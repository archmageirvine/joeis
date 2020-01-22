package irvine.oeis.a028;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028433.
 * @author Sean A. Irvine
 */
public class A028433 implements Sequence {

  private static final CR BASE_LOG = CR.THREE.log();
  private long mN = 0;

  @Override
  public Z next() {
    // todo this is a bit confused it seems always do at least one step?
    if (++mN == 1) {
      return Z.THREE;
    }
    long m = mN;
    final StringBuilder sb = new StringBuilder(Long.toString(m, 3));
    while (m > 0) {
      sb.append(Long.toString(m, 3));
      m = CR.valueOf(m).log().divide(BASE_LOG).floor().longValueExact();
    }
    if (sb.length() <= 1) {
      sb.append(0);
    }
    return new Z(sb, 3);
  }
}
