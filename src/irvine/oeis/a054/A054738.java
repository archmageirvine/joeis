package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054738 Squares which can be split into two nonzero squares (perhaps with leading zeros) in two different ways.
 * @author Sean A. Irvine
 */
public class A054738 extends A054737 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
