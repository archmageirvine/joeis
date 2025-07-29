package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A079051 Recam\u00e1n variation: a(0) = 0; for n &gt;= 1, a(n) = a(n-1) - f(n) if that number is positive and not already in the sequence, otherwise a(n) = a(n-1) + f(n), where f(n) = floor(sqrt(n)) (A000196).
 * @author Sean A. Irvine
 */
public class A079051 extends Sequence0 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mPrev = 0;
  private long mN = -1;

  @Override
  public Z next() {
    final long f = Functions.SQRT.l(++mN);
    final long t = mPrev - f;
    final long u = t > 0 && !mSeen.isSet(t) ? t : mPrev + f;
    mSeen.set(u);
    mPrev = u;
    return Z.valueOf(u);
  }
}

