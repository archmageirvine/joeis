package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071686 Smallest solution to gcd(x, Rev(x)) = 2^n.
 * @author Sean A. Irvine
 */
public class A071686 extends Sequence1 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply2();
    Z k = mA;
    while (true) {
      if (Functions.GCD.z(k, Functions.REVERSE.z(k)).equals(mA)) {
        return k;
      }
      k = k.add(mA);
    }
  }
}
