package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a004.A004520;

/**
 * A059627 Generalized nim sum n + n + n + n in base 10; carryless multiplication 4 X n base 10.
 * @author Sean A. Irvine
 */
public class A059627 extends A004520 {

  @Override
  public Z next() {
    final Z t = super.next();
    return nimSum(10, t, t);
  }
}

