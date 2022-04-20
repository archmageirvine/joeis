package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a152.A152176;

/**
 * A056361 Number of bracelet structures using exactly six different colored beads.
 * @author Sean A. Irvine
 */
public class A056361 extends A152176 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 6);
  }
}
