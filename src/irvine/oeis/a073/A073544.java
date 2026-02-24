package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073544 Numbers k such that 1/(1/phi(k) + 1/phi(k+1) + 1/phi(k+2) + 1/phi(k+3)) is an integer.
 * @author Sean A. Irvine
 */
public class A073544 extends Sequence1 {

  private long mN = 12;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (new Q(Z.ONE, Functions.PHI.z(mN))
        .add(new Q(Z.ONE, Functions.PHI.z(mN + 1)))
        .add(new Q(Z.ONE, Functions.PHI.z(mN + 2)))
        .add(new Q(Z.ONE, Functions.PHI.z(mN + 3)))
        .num().isOne()) {
        return Z.valueOf(mN);
      }
    }
  }
}
