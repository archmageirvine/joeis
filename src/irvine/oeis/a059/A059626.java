package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a004.A004520;

/**
 * A059626 Generalized nim sum n + n + n in base 10; carryless multiplication 3 X n base 10.
 * @author Sean A. Irvine
 */
public class A059626 extends A004520 {

  @Override
  public Z next() {
    return nimSum(10, super.next(), mN);
  }
}

