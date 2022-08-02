package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006880;

/**
 * A058290 Rounded difference between 10^n/(log(10^n) - A) and pi(10^n), where A is Legendre's constant and pi is the prime counting function.
 * @author Sean A. Irvine
 */
public class A058290 extends A058289 {

  private final Sequence mA = new A006880();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
