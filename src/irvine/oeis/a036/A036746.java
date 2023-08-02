package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036746 Numbers with "long" representations in Roman notation: given by last n letters from ...MMMDCCCLXXXVIII.
 * @author Sean A. Irvine
 */
public class A036746 extends Sequence1 {

  private static final long[] SMALL = {1, 2, 3, 8, 18, 28, 38, 88, 188, 288, 388};
  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN < SMALL.length ? SMALL[mN] : 888 + (mN - SMALL.length) * 1000L);
  }
}

