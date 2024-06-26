package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A005086 Number of Fibonacci numbers 1,2,3,5,... dividing n.
 * @author Sean A. Irvine
 */
public class A005086 extends Sequence1 implements DirectSequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return a(mN);
  }

  @Override
  public Z a(final Z n) {
    long c = 0;
    final Sequence fibo = new A000045().skip(2);
    Z d;
    while ((d = fibo.next()).compareTo(n) <= 0) {
      if (n.mod(d).isZero()) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}

