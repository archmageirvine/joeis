package irvine.oeis.a007;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A007374 Smallest k such that phi(x) = k has exactly n solutions, n&gt;=2.
 * @author Sean A. Irvine
 */
public class A007374 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z m = Z.ZERO;
    while (true) {
      m = m.add(1);
      if (InverseEuler.inversePhi(m).size() == mN) {
        return m;
      }
    }
  }
}
