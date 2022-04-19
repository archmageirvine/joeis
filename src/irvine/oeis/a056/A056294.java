package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a152.A152175;

/**
 * A056294 Number of n-bead necklace structures using a maximum of six different colored beads.
 * @author Sean A. Irvine
 */
public class A056294 extends A152175 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 1).add(t(mN, 2)).add(t(mN, 3)).add(t(mN, 4)).add(t(mN, 5)).add(t(mN, 6));
  }
}
