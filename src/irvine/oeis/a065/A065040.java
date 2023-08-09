package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;

/**
 * A065040 Triangle read by rows: T(m,k) = exponent of the highest power of 2 dividing the binomial coefficient binomial(m,k).
 * @author Sean A. Irvine
 */
public class A065040 extends A007318 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().makeOdd().auxiliary());
  }
}

