package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a152.A152176;

/**
 * A056353 Number of bracelet structures using a maximum of three different colored beads.
 * @author Sean A. Irvine
 */
public class A056353 extends A152176 {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : t(mN, 1).add(t(mN, 2)).add(t(mN, 3));
  }
}
