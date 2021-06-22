package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048558 a(n+1)^2 is next smallest nontrivial square beginning with a(n)^2, initial square is 1.
 * @author Sean A. Irvine
 */
public class A048558 extends A048557 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
