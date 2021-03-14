package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045497 Packing density for n balls in complex projective plane using Fubini-Study metric (denominators).
 * @author Sean A. Irvine
 */
public class A045497 implements Sequence {

  private long[] SMALL = {1, 2, 4, 1, 25, 25, 64, 289};
  private int mN = 0;

  @Override
  public Z next() {
    if (mN < SMALL.length) {
      return Z.valueOf(SMALL[mN++]);
    }
    return Z.ONE;
  }
}
