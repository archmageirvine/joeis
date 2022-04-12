package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.oeis.a072.A072493;

/**
 * A245356 Number of numbers whose base-4/3 expansion (see A024631) has n digits.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A245356 extends A072493 {

  @Override
  public Z next() {
    return super.next().multiply(4);
  }
}
