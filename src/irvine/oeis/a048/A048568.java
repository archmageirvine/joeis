package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048568 a(n+1)^3 is next smallest nontrivial cube beginning with a(n)^3, initial cube is 27.
 * @author Sean A. Irvine
 */
public class A048568 extends A048567 {

  @Override
  public Z next() {
    return super.next().root(3);
  }
}
