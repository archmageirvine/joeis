package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a023.A023200;

/**
 * A047847 Numbers n such that n + (n+1) and (n+2) + (n+3) are both prime.
 * @author Sean A. Irvine
 */
public class A047847 extends A023200 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
