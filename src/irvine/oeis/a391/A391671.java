package irvine.oeis.a391;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391671 allocated for Frank Hollstein.
 * @author Sean A. Irvine
 */
public class A391671 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN, w -> Binomial.binomial(mN * (mN - 2L), w)
      .multiply(Integers.SINGLETON.sum(0, mN, b -> Binomial.binomial(mN * (mN - 2L) - w, b)))
    );
  }
}
