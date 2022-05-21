package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a002.A002034;

/**
 * A057109 Numbers n that are not factors of P(n)!, where P(n) is the largest prime factor of n.
 * @author Sean A. Irvine
 */
public class A057109 extends A002034 {

  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    while (super.next().isProbablePrime()) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
