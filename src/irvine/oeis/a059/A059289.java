package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059289 a(n) = 1 + (binomial(2n,n) mod n).
 * @author Sean A. Irvine
 */
public class A059289 extends A059288 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
