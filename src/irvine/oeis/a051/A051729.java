package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051729 Smallest number at distance 2n+1 from nearest prime.
 * @author Sean A. Irvine
 */
public class A051729 extends A051652 {

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}
