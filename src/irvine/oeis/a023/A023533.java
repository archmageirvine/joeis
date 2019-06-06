package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a014.A014306;

/**
 * A023533 <code>a(n) = 1</code> if n is of the form <code>m(m+1)(m+2)/6</code>, and 0 otherwise.
 * @author Sean A. Irvine
 */
public class A023533 extends A014306 {

  @Override
  public Z next() {
    return Z.ONE.subtract(super.next());
  }
}
