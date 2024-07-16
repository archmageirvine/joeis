package irvine.oeis.a071;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071386 Numbers k such that the cardinality of the set of solutions to phi(x) = k is odd.
 * @author Sean A. Irvine
 */
public class A071386 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if ((InverseEuler.inversePhi(mN).size() & 1) == 1) {
        return mN;
      }
    }
  }
}
