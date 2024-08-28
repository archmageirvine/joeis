package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000040;

/**
 * A071265.
 * @author Sean A. Irvine
 */
public class A072044 extends Sequence0 {

  private final Sequence mPrimes = new A000040();
  private Q mProduct = null;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (mProduct == null) {
      mProduct = Q.ONE;
    } else {
      final Z p2 = mPrimes.next().square();
      mProduct = mProduct.multiply(p2).divide(p2.subtract(1));
    }
    return select(mProduct);
  }
}

