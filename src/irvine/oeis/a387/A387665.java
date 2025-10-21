package irvine.oeis.a387;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A387665 Smallest nonnegative integer coprime to 5 with a constant congruence speed &gt;= n (see A373387 for the definition of "constant congruence speed").
 * @author Sean A. Irvine
 */
public class A387665 extends Sequence0 {

  // After Marco Ripa, only good for a few terms

  private final ArrayList<Z> mS = new ArrayList<>();
  private Z mK = Z.ZERO;
  private int mN = 0;

  @Override
  public Z next() {
    while (mS.size() <= mN || mS.get(mN) == null) {
      mK = mK.add(1);
      if (mK.mod(5) != 0) {
        final long t = A387664.v(mK);
        while (mS.size() <= t) {
          mS.add(null);
        }
        for (int n = 0; n <= t; ++n) {
          if (mS.get(n) == null) {
            mS.set(n, mK);
          }
        }
      }
    }
    return mS.get(mN++);
  }
}

