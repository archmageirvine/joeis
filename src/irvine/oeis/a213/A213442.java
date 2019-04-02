package irvine.oeis.a213;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A213442 Number of 3-colored graphs on n labeled nodes.
 * @author Sean A. Irvine
 */
public class A213442 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    ++mN;
    final A213441 seq = new A213441();
    for (int k = 1; k < mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(seq.next()).shiftLeft(k * (mN - k)));
    }
    return sum;
  }
}

