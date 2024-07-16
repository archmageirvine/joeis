package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A071391 Least number m such that sigma(m) + phi(m) = n or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A071391 extends Sequence1 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int s = Functions.SIGMA1.i(mN) + Functions.PHI.i(mN);
    if (mFirsts.get(s) == 0) {
      mFirsts.set(s, mN);
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
