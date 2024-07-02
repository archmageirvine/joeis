package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A071147 Smallest squarefree number k with exactly n prime factors such that the sum of the prime factors is divisible by the largest prime dividing k, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A071147 extends Sequence1 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ZERO;
    }
    while (mFirsts.get(mN) == 0) {
      if (Functions.SOPF.z(++mM).mod(Functions.GPF.l(mM)) == 0) {
        final int omega = Functions.OMEGA.i(mM);
        if (mFirsts.get(omega) == 0) {
          mFirsts.set(omega, mM);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
