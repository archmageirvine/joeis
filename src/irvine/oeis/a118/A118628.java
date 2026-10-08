package irvine.oeis.a118;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A118628 "Say what you see".
 * See A005151.
 * @author Georg Fischer
 */
public class A118628 extends Sequence1 {

  private static final long[] S = {3, 13, 1113, 3113, 2123, 112213, 312213, 212223, 114213, 31121314, 41122314, 31221324, 21322314};
  private int mN = -1;

  @Override
  public Z next() {
    if (mN < S.length - 1) {
      ++mN;
    }
    return Z.valueOf(S[mN]);
  }
}
