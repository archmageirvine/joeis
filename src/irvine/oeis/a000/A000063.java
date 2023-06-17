package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000063 Symmetrical dissections of an n-gon.
 * @author Sean A. Irvine
 */
public class A000063 extends AbstractSequence {

  /* Construct the sequence. */
  public A000063() {
    super(5);
  }

  private long mN = 4;

  @Override
  public Z next() {
    ++mN;
    Z t = Binomial.catalan(mN / 2 - 1);
    if ((mN & 3) == 0) {
      t = t.subtract(Binomial.catalan(mN / 4 - 1));
    }
    if (mN % 6 == 0) {
      t = t.subtract(Binomial.catalan(mN / 6 - 1));
    }
    return t;
  }
}

