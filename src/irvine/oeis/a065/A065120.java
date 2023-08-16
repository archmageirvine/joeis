package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a057.A057335;

/**
 * A065120 Highest power of 2 dividing A057335(n).
 * @author Sean A. Irvine
 */
public class A065120 extends A057335 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().makeOdd().auxiliary());
  }
}

