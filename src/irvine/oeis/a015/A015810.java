package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A015810 k is the first integer such that phi(k+n) | sigma(k)+n.
 * @author Sean A. Irvine
 */
public class A015810 extends Sequence0 {

  private final LongDynamicLongArray mPhi = new LongDynamicLongArray();
  private long mN = -1;

  private long phi(final long n) {
    final long r = mPhi.get(n);
    if (r != 0) {
      return r;
    }
    final long t = Functions.PHI.l(n);
    mPhi.set(n, t);
    return t;
  }


  private long findIt(final long n) {
    long k = 1;
    while ((Functions.SIGMA1.l(k) + n) % phi(n + k) != 0) {
      ++k;
    }
    return k;
  }

  @Override
  public Z next() {
    return Z.valueOf(findIt(++mN));
  }
}

