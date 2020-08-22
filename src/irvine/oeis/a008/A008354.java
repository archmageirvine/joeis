package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a004.A004068;

/**
 * A008354 a(n) = (5*n^2 + 1)*n^2 / 6.
 * @author Sean A. Irvine
 */
public class A008354 extends A004068 {

  @Override
  public Z next() {
    return super.next().multiply(mN);
  }
}


