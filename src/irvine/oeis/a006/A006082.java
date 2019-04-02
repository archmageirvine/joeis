package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A006082 Number of labeled projective plane trees (or "flat" trees) with n nodes.
 * @author Sean A. Irvine
 */
public class A006082 extends A006080 {

  private long mN = 0;
  private final A006081 mA6081 = new A006081();
  private final A000108 mA108 = new A000108();

  @Override
  public Z next() {
    final Z t = ++mN > 1 ? mA6081.next() : Z.ZERO;
    final Z u = (mN & 1) == 0 ? mA108.next() : Z.ZERO;
    return super.next().subtract(t).add(u);
  }
}

