package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a066.A066417;

/**
 * A058838 a(n) = 1 + sum of the anti-divisors of n.
 * @author Sean A. Irvine
 */
public class A058838 extends A066417 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
