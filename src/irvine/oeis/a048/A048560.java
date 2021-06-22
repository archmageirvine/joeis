package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048560 a(n+1)^2 is next smallest nontrivial square beginning with a(n)^2, initial square is 4.
 * @author Sean A. Irvine
 */
public class A048560 extends A048559 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
