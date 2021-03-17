package irvine.oeis.a045;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045723 Number of configurations, excluding reflections and black-white interchanges, of n black and n white beads on a string.
 * @author Sean A. Irvine
 */
public class A045723 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    Z t = Z.ONE.shiftLeft(++mN).add(Binomial.binomial(2 * mN, mN));
    if ((mN & 1) == 0) {
      t = t.add(Binomial.binomial(mN - 1, (mN - 2) / 2).multiply2());
    }
    return t.divide(4);
  }
}
