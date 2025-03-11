package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a024.A024168;

/**
 * A075828 Let u(1) = x and u(n+1) = (n^2/u(n)) + 1 for n &gt;= 1; then a(n) is such that u(n) =(b(n)*x + a(n))/(c(n)*x + d(n)) (in lowest terms) and a(n), b(n), c(n), d(n) are positive integers.
 * @author Sean A. Irvine
 */
public class A075828 extends Sequence1 {

  private final Sequence mSeq = new A024168();
  private Z mA = mSeq.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mSeq.next();
    return mA.divide(mA.gcd(t));
  }
}
