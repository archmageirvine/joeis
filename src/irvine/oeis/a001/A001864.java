package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001864 Total height of rooted trees with n labeled nodes.
 * @author Sean A. Irvine
 */
public class A001864 extends AbstractSequence {

  /* Construct the sequence. */
  public A001864() {
    super(1);
  }

  protected int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 1; k < mN; ++k) {
      s = s.add(Binomial.binomial(mN, k).multiply(Z.valueOf(mN - k).pow(mN - k)).multiply(Z.valueOf(k).pow(k)));
    }
    return s;
  }
}
