package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * A002396 Inverse of reduced totient function.
 * @author Sean A. Irvine
 */
public class A002396 extends A002174 {

  private long mPos = 3;
  private final LongDynamicLongArray mInverse = new LongDynamicLongArray();
  private final A002322 mCarmichaelLambda = new A002322();

  {
    // Skip the odd values
    mCarmichaelLambda.next();
    mCarmichaelLambda.next();
  }

  @Override
  public Z next() {
    final long mN = super.next().longValueExact() / 2;
    if (mN == 0) {
      return Z.ONE;
    }
    while (mInverse.get(mN) == 0) {
      final long c = mCarmichaelLambda.next().longValueExact() / 2;
      if (mInverse.get(c) == 0) {
        mInverse.set(c, mPos);
      }
      ++mPos;
    }
    return Z.valueOf(mInverse.get(mN));
  }
}
