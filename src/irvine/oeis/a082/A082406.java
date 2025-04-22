package irvine.oeis.a082;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081868 Numbers k such that Sum_{j=1..k} (binomial(2*j,j) mod 3) is even.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A082406 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(Binomial.binomial(2 * ++mN, mN));
      if (mSum.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
