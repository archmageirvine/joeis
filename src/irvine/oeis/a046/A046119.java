package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046119 Middle member of a sexy prime triple: value of p+6 such that p, p+6 and p+12 are all prime, but p+18 is not (although p-6 might be).
 * @author Sean A. Irvine
 */
public class A046119 extends A046118 {

  @Override
  public Z next() {
    return super.next().add(6);
  }
}
