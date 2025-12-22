package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082788 Numbers k such that the product of Euler phi of the 2 consecutive integers {k,k+1} is a 4th power: if sqrt(sqrt(phi(k)*phi(k+1))) is an integer, then k is here.
 * @author Sean A. Irvine
 */
public class A082788 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(++mN).multiply(Functions.PHI.z(mN + 1)).root(4).auxiliary() == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
