package irvine.oeis.a393;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.DynamicLongArray;

/**
 * A393608 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A393608 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private final DynamicLongArray mP = new DynamicLongArray();
  private int mN = 0;
  private int mM = -1;

  private Z t(final int row) {
    final int mod = row + 2;
    final long p = mPrime.nextPrime(mP.get(row));
    mP.set(row, p);
    return Z.valueOf(p % mod);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM);
  }
}
