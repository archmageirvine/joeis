package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045496 Packing density for n balls in complex projective plane using Fubini-Study metric (numerators).
 * @author Sean A. Irvine
 */
public class A045496 extends Sequence1 {

  private static final long[] SMALL = {1, 1, 3, 1, 20, 24, 63, 288};
  private int mN = 0;

  @Override
  public Z next() {
    if (mN < SMALL.length) {
      return Z.valueOf(SMALL[mN++]);
    }
    return Z.ONE;
  }
}
