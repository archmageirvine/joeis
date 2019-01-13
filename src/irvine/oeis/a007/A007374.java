package irvine.oeis.a007;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007374.
 * @author Sean A. Irvine
 */
public class A007374 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z m = Z.ZERO;
    while (true) {
      m = m.add(1);
      if (Euler.inversePhi(m).size() == mN) {
        return m;
      }
    }
  }
}
