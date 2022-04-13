package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056056 Square root of largest square dividing n-th central binomial coefficient.
 * @author Sean A. Irvine
 */
public class A056056 extends A056057 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
