package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023532 <code>a(n) = 0</code> if n of form <code>m(m+3)/2</code>, otherwise 1.
 * @author Sean A. Irvine
 */
public class A023532 extends A023531 {

  @Override
  public Z next() {
    return Z.ONE.subtract(super.next());
  }
}
