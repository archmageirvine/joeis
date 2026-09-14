package irvine.oeis.a115;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A115852 a(n) = ceiling((F(n)^4-1)^2 / (4*F(n)^4)) where F(n) = A000045(n) are the Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A115852 extends Sequence1 {

  private final Sequence mF = new A000045().skip();

  @Override
  public Z next() {
    final Z f4 = mF.next().pow(4);
    return new Q(f4.subtract(1).square(), f4.multiply(4)).ceiling();
  }
}

