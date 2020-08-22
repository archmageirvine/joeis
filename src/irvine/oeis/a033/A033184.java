package irvine.oeis.a033;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033184 Catalan triangle A009766 transposed.
 * @author Sean A. Irvine
 */
public class A033184 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Binomial.binomial(2 * mN - mM, mN).multiply(mM).divide(2 * mN - mM);
  }
}
