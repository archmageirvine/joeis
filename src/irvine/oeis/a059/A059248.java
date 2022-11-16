package irvine.oeis.a059;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A059248 Numerator of 1/F(1) + 1/F(2) + 1/F(3) + ... + 1/F(n), where F(n) is the n-th Fibonacci number (A000045).
 * @author Sean A. Irvine
 */
public class A059248 extends A000045 {

  private Q mSum = Q.ZERO;
  {
    setOffset(1);
    super.next();
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mSum = mSum.add(new Q(Z.ONE, super.next()));
    return select(mSum);
  }
}
