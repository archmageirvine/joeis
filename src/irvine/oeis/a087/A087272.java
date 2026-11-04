package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence2;

/**
 * A087272 a(n) is the largest prime number in 3x+1 trajectory initiated at n.
 * @author Sean A. Irvine
 */
public class A087272 extends Sequence2 implements DirectSequence {

  protected Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return a(mN);
  }

  @Override
  public Z a(final Z n) {
    Z max = Z.TWO;
    Z m = n;
    while (!Z.ONE.equals(m)) {
      if (m.compareTo(max) > 0 && m.isProbablePrime()) {
        max = m;
      }
      m = Functions.COLLATZ.z(m);
    }
    return max;
  }

  @Override
  public Z a(final long n) {
    return a(Z.valueOf(n));
  }
}
