package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050631 a(1)=2; for n&gt;1, a(n)^2 is next smallest nontrivial square containing a(n-1)^2 as a substring.
 * @author Sean A. Irvine
 */
public class A050631 extends A050630 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
