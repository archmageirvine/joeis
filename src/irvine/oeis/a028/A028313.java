package irvine.oeis.a028;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028313.
 * @author Sean A. Irvine
 */
public class A028313 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mN <= 1 ? Z.ONE : Binomial.binomial(mN, mM).add(Binomial.binomial(mN - 2, mM - 1).multiply(3));
  }
}
