package irvine.oeis.a037;

import irvine.math.z.Z;

/**
 * A037073 Numbers k such that (6*k)^2 is the sum of a twin prime pair.
 * @author Sean A. Irvine
 */
public class A037073 extends A037072 {

  @Override
  public Z next() {
    return super.next().sqrt().divide(6);
  }
}
