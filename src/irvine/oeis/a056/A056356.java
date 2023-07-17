package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a152.A152176;

/**
 * A056356 Number of bracelet structures using a maximum of six different colored beads.
 * @author Sean A. Irvine
 */
public class A056356 extends A152176 {

  /** Construct the sequence. */
  public A056356() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : t(mN, 1).add(t(mN, 2)).add(t(mN, 3)).add(t(mN, 4)).add(t(mN, 5)).add(t(mN, 6));
  }
}
