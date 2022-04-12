package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.oeis.a120.A120160;

/**
 * A245357 Number of numbers with property that their base 5/4 expansion (see A024634) has n digits.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A245357 extends A120160 {

  @Override
  public Z next() {
    return super.next().multiply(5);
  }
}
