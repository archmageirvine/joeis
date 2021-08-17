package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050641 a(n+1)^3 is next smallest nontrivial cube containing a(n)^3 as a substring.
 * @author Sean A. Irvine
 */
public class A050641 extends A050640 {

  @Override
  public Z next() {
    return super.next().root(3);
  }
}
