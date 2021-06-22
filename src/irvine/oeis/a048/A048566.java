package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048566 a(n+1)^3 is next smallest nontrivial cube beginning with a(n)^3, initial cube is 8.
 * @author Sean A. Irvine
 */
public class A048566 extends A048565 {

  @Override
  public Z next() {
    return super.next().root(3);
  }
}
