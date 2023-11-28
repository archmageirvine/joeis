package irvine.oeis.a066;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066974 Integers of the form (1/m)*sum(i=1,m,binomial(2i,i)).
 * @author Sean A. Irvine
 */
public class A066974 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(Binomial.binomial(2 * ++mN, mN));
      if (mSum.mod(mN) == 0) {
        return mSum.divide(mN);
      }
    }
  }
}
