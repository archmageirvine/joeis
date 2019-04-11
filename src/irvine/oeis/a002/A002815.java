package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A002815 <code>a(n) = n +</code> Sum_{k=1..n} pi(k), where pi() = A000720.
 * @author Sean A. Irvine
 */
public class A002815 extends A000720 {

  private Z mSum = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mSum = mSum.add(super.next());
    }
    return mSum.add(mN);
  }
}

