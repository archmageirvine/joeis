package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066167 Numbers n such that phi(n) = (phi(n+1) + phi(n-1))/2.
 * @author Sean A. Irvine
 */
public class A066167 extends Sequence1 {

  private long mN = 5186;

  @Override
  public Z next() {
    while (true) {
      if (Euler.phi(++mN).equals(Euler.phi(mN - 1).add(Euler.phi(mN + 1)).divide2())) {
        return Z.valueOf(mN);
      }
    }
  }
}
