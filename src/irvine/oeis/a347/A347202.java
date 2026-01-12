package irvine.oeis.a347;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A347202 Numbers whose number of odd divisors is not equal to 2.
 * @author Sean A. Irvine
 */
public class A347202 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (!Functions.MAKE_ODD.z(++mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

