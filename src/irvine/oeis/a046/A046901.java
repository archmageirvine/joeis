package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046901 a(n) = a(n-1) - n if a(n-1) &gt; n, else a(n) = a(n-1) + n.
 * @author Sean A. Irvine
 */
public class A046901 implements Sequence {

  private long mPrev = 0;
  private long mN = 0;

  @Override
  public Z next() {
    final long t = mPrev - ++mN;
    final long u = t > 0 ? t : mPrev + mN;
    mPrev = u;
    return Z.valueOf(u);
  }
}
