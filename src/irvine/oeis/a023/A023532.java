package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023532 a(n) = 0 if n is of the form m*(m+3)/2, otherwise 1.
 * @author Sean A. Irvine
 */
public class A023532 extends A023531 {

  @Override
  public Z next() {
    return Z.ONE.subtract(super.next());
  }
}
