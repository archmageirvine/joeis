package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051728 Smallest number at distance 2n from nearest prime.
 * @author Sean A. Irvine
 */
public class A051728 extends A051652 {

  @Override
  public Z next() {
    final Z t = super.next();
    super.next();
    return t;
  }
}
