package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a152.A152175;

/**
 * A056296 Number of n-bead necklace structures using exactly three different colored beads.
 * @author Sean A. Irvine
 */
public class A056296 extends A152175 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 3);
  }
}
