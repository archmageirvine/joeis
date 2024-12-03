package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073542 Numbers k such that 1/(1/phi(k) + 1/phi(k+1)) is an integer.
 * @author Sean A. Irvine
 */
public class A073542 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (new Q(Z.ONE, Functions.PHI.z(mN)).add(new Q(Z.ONE, Functions.PHI.z(mN + 1))).num().equals(Z.ONE)) {
        return Z.valueOf(mN);
      }
    }
  }
}
