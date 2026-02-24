package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073541 Numbers k such that 1/(1/sigma(k) + 1/sigma(k+1)) is an integer.
 * @author Sean A. Irvine
 */
public class A073541 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (new Q(Z.ONE, Functions.SIGMA1.z(mN)).add(new Q(Z.ONE, Functions.SIGMA1.z(mN + 1))).num().isOne()) {
        return Z.valueOf(mN);
      }
    }
  }
}
