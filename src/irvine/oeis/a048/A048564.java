package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048564 a(n+1)^3 is next smallest nontrivial cube beginning with a(n)^3, initial cube is 1.
 * @author Sean A. Irvine
 */
public class A048564 extends A048563 {

  @Override
  public Z next() {
    return super.next().root(3);
  }
}
