package irvine.oeis.a107;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a000.A000720;

/**
 * A107609 a(n) = round(n / pi(n)) = round(n / A000720(n)) where round(x) rounds half to even.
 * @author Sean A. Irvine
 */
public class A107609 extends Sequence2 {

  private final Sequence mPi = new A000720().skip();
  private long mN = 1;

  @Override
  public Z next() {
    final Q v = new Q(++mN, mPi.next());
    return v.den().equals(Z.TWO) ? v.ceiling().clearBit(0) : v.round();
  }
}

