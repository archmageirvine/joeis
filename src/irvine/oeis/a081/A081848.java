package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.a073.A073941;

/**
 * A081848 Number of numbers whose base-3/2 expansion (see A024629) has n digits.
 * @author Sean A. Irvine
 */
public class A081848 extends A073941 {

  @Override
  public Z next() {
    return super.next().multiply(3);
  }
}
