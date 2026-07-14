package irvine.oeis.a121;

import irvine.math.z.Z;

/**
 * A121849 The spiral parameter epsilon for the icosahedral fullerenes C_n.
 * @author Sean A. Irvine
 */
public class A121849 extends A121847 {

  @Override
  protected Z select(final State state) {
    // epsilon
    final long i = state.mI;
    final long j = state.mJ;
    return Z.valueOf((5 * i * i + 15 * j * j - 3 * i - 7 * j - i * (j == 0 ? 2 : 0)) / 2);
  }
}
