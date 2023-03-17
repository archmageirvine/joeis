package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007504;
import irvine.oeis.a024.A024450;

/**
 * A062022 a(n) = Sum_{k=1..n} Sum_{j=1..k} (prime(k) - prime(j))^2.
 * @author Sean A. Irvine
 */
public class A062022 extends A024450 {

  private final Sequence mA = new A007504();
  {
    mA.next();
  }
  private long mN = 0;

  @Override
  public Z next() {
    return super.next().multiply(++mN).subtract(mA.next().square());
  }
}
