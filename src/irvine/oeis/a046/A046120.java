package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046120 Largest member of a sexy prime triple; value of p+12 where p, p+6 and p+12 are all prime, but p+18 is not.
 * @author Sean A. Irvine
 */
public class A046120 extends A046118 {

  @Override
  public Z next() {
    return super.next().add(12);
  }
}
