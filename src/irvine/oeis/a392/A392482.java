package irvine.oeis.a392;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392482 allocated for Courtney Gibbons.
 * @author Sean A. Irvine
 */
public class A392482 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN * mN) {
      ++mN;
      mM = 0;
    }
    return Integers.SINGLETON.sum(1, mN, i -> Integers.SINGLETON.sum(0, mN, j -> Z.NEG_ONE.pow(i + j).multiply(Binomial.binomial(mN, j)).multiply(Binomial.binomial((long) (mN - i) * (mN - j), mM))).multiply(Binomial.binomial(mN, i))).negate();
  }
}

