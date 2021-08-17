package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050633 a(1)=3; for n&gt;1, a(n)^2 is next smallest nontrivial square containing a(n-1)^2 as a substring.
 * @author Sean A. Irvine
 */
public class A050633 extends A050632 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
