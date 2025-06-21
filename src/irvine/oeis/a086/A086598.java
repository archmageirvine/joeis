package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A086598 Number of distinct prime factors in Lucas(n).
 * @author Sean A. Irvine
 */
public class A086598 extends A000032 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.OMEGA.i(super.next()));
  }
}
