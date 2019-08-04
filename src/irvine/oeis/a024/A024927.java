package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a038.A038605;

/**
 * A024927 <code>a(n) = Sum_{k=1..n} k*floor( prime(k)/k )</code>.
 * @author Sean A. Irvine
 */
public class A024927 extends A038605 {

  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mSum = mSum.add(super.next().multiply(++mN));
    return mSum;
  }
}
