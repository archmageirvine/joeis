package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001042;

/**
 * A064236 Number of decimal digits in A001042.
 * @author Sean A. Irvine
 */
public class A064236 extends A001042 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.DIGIT_LENGTH.i(super.next()));
  }
}
