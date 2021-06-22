package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048562 a(n+1)^2 is next smallest nontrivial square beginning with a(n)^2, initial square is 9.
 * @author Sean A. Irvine
 */
public class A048562 extends A048561 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
