package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076228 Number of terms k in the trajectory of the Collatz function applied to n such that k &lt; n.
 * @author Sean A. Irvine
 */
public class A076228 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    long cnt = 0;
    while (m.compareTo(Z.ONE) > 0) {
      m = Functions.COLLATZ.z(m);
      if (m.compareTo(mN) < 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
