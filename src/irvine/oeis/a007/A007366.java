package irvine.oeis.a007;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007366 Numbers n such that <code>phi(x) = n</code> has exactly 2 solutions.
 * @author Sean A. Irvine
 */
public class A007366 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Euler.inversePhi(mN).size() == 2) {
        return mN;
      }
    }
  }
}
