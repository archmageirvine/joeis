package irvine.oeis.a121;

import irvine.math.z.Z;

/**
 * A121848 The spiral parameter gamma for the icosahedral fullerenes C_n.
 * @author Sean A. Irvine
 */
public class A121848 extends A121847 {

  @Override
  protected Z select(final State state) {
    // gamma
    final long i = state.mI;
    final long j = state.mJ;
    return Z.valueOf((5 * i + 1) * (i - 1) + j * (5 * i - 3));
  }
}
