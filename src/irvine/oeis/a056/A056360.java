package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a152.A152176;

/**
 * A056360 Number of bracelet structures using exactly five different colored beads.
 * @author Sean A. Irvine
 */
public class A056360 extends A152176 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}
