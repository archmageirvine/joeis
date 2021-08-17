package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050643 a(n+1)^3 is next smallest nontrivial cube containing a(n)^3 as a substring, initial term is 8.
 * @author Sean A. Irvine
 */
public class A050643 extends A050642 {

  @Override
  public Z next() {
    return super.next().root(3);
  }
}
