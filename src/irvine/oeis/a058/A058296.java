package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a024.A024675;

/**
 * A058296 Average of consecutive primes.
 * @author Sean A. Irvine
 */
public class A058296 extends A024675 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.TWO;
    }
    final Z res = super.next();
    super.next();
    return res;
  }
}
