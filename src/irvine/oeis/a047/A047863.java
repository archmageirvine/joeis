package irvine.oeis.a047;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A047863 Number of labeled graphs with 2-colored nodes where black nodes are only connected to white nodes and vice versa.
 * @author Sean A. Irvine
 */
public class A047863 extends AbstractSequence {

  /** Construct the sequence. */
  public A047863() {
    super(0);
  }

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      s = s.add(Binomial.binomial(mN, k).shiftLeft(k * (mN - k)));
    }
    return s;
  }
}
