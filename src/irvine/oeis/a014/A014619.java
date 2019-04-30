package irvine.oeis.a014;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003422;

/**
 * A014619 Exponential generating function is <code>-f(x) *</code> int(exp(exp(-t)-1),t,0,x) where <code>f(x) = exp(1-x-exp(-x))</code> is an exponential generating function for A014182.
 * @author Sean A. Irvine
 */
public class A014619 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    final A003422 a = new A003422();
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.signedAdd(((mN - k) & 1) == 1, Stirling.secondKind(mN, k).multiply(a.next()));
    }
    return sum;
  }
}
