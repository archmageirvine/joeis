package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006880;

/**
 * A057794 (Integer nearest R(10^n)) - pi(10^n), where pi(x) is the number of primes &lt;= x, R(x) = Sum_{ k&gt;=1 } (mu(k)/k * li(x^(1/k))) and li(x) is the Cauchy principal value of the integral from 0 to x of dt/log(t).
 * @author Sean A. Irvine
 */
public class A057794 extends A057793 {

  private final Sequence mA = new A006880();
  {
    mA.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
