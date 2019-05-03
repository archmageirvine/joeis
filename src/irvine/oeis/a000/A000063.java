package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000063 Symmetrical dissections of an <code>n-gon</code>.
 * @author Sean A. Irvine
 */
public class A000063 implements Sequence {

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

