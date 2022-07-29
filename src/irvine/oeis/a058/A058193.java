package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a000.A000230;

/**
 * A058193 Smallest prime p such that there is a gap of 6n between p and the next prime.
 * @author Sean A. Irvine
 */
public class A058193 extends A000230 {

  {
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    super.next();
    return super.next();
  }
}
