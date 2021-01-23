package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001222;

/**
 * A025532 a(n) is the sum of exponents in the prime factorization of lcm{C(n,0), C(n,1), ..., C(n,n)}.
 * @author Sean A. Irvine
 */
public class A025532 extends A025528 {

  private final Sequence mA = new A001222();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
