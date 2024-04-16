package irvine.oeis.a367;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003261;

/**
 * A367006 Number of distinct prime factors of n*2^n - 1.
 * @author Sean A. Irvine
 */
public class A367006 extends A003261 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.OMEGA.i(super.next()));
  }
}
