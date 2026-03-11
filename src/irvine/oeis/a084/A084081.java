package irvine.oeis.a084;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084081 Sum of lists created by n substitutions k -&gt; Range[k+1,0,-2] starting with {0}, counting down from k+1 to 0 step -2.
 * @author Sean A. Irvine
 */
public class A084081 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      return Binomial.binomial((3 * mN + 2) / 2, (mN - 2) / 2).multiply(10).divide(mN + 3);
    } else {
      return Binomial.binomial((3 * mN + 5) / 2, (mN + 1) / 2).multiply(2 * (3 * mN + 1)).divide(mN + 3).divide(3 * mN + 5);
    }
  }
}

