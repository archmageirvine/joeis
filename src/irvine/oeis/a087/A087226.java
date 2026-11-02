package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087226 LCM of terms in Collatz (3x+1) function initiated at n.
 * @author Sean A. Irvine
 */
public class A087226 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z lcm = mN;
    Z m = mN;
    while (!Z.ONE.equals(m)) {
      if (m.isEven()) {
        m = m.makeOdd();
      } else {
        m = m.multiply(3).add(1);
      }
      lcm = lcm.lcm(m);
    }
    return lcm;
  }
}
