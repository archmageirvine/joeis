package irvine.oeis.a391;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A391533 allocated for Leonidas Liponis.
 * @author Sean A. Irvine
 */
public class A391533 extends Sequence2 {

  private int mN = 2;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN - 2, mM).add(Binomial.binomial(mN - 2, mM - 1)).multiply(4).add(Binomial.binomial(mN - 2, mM - 2));
  }
}

