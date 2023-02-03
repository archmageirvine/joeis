package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A061288 Integer part of square root of n-th triangular number.
 * @author Sean A. Irvine
 */
public class A061288 extends A000217 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
