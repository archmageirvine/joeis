package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A028895 5 times triangular numbers: a(n) = 5*n*(n+1)/2.
 * @author Sean A. Irvine
 */
public class A028895 extends A000217 {

  @Override
  public Z next() {
    return super.next().multiply(5);
  }
}
