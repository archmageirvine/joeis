package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000131 Number of asymmetrical dissections of n-gon.
 * @author Sean A. Irvine
 */
public class A000131 extends AbstractSequence {

  /* Construct the sequence. */
  public A000131() {
    super(7);
  }

  private long mN = 6;

  @Override
  public Z next() {
    ++mN;
    Z t = Binomial.catalan(mN - 2).subtract(Binomial.catalan(mN / 2 - 1).multiply(mN));
    if ((mN & 1) == 0) {
      t = t.subtract(Binomial.catalan(mN / 2 - 1).multiply(mN).divide2());
    }
    if (mN % 3 == 0) {
      t = t.subtract(Binomial.catalan(mN / 3 - 1).multiply(mN).divide(3));
    }
    if ((mN & 3) == 0) {
      t = t.add(Binomial.catalan(mN / 4 - 1).multiply(mN));
    }
    if (mN % 6 == 0) {
      t = t.add(Binomial.catalan(mN / 6 - 1).multiply(mN));
    }
    return t.divide(2 * mN);
  }
}

