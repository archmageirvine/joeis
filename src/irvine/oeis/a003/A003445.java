package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A003445 Number of nonequivalent dissections of an n-gon into n-4 polygons by nonintersecting diagonals up to rotation.
 * @author Sean A. Irvine
 */
public class A003445 extends AbstractSequence {

  /** Construct the sequence. */
  public A003445() {
    super(5);
  }

  private long mN = 4;

  @Override
  public Z next() {
    ++mN;
    Q t = new Q(Z.valueOf(mN - 3).square().multiply(mN - 4).multiply(Binomial.catalan(mN - 2)), Z.FOUR.multiply(mN).multiply(2 * mN - 5));
    if (mN % 5 == 0) {
      t = t.add(new Q(Binomial.catalan(mN / 5 - 1).shiftLeft(2), Z.FIVE));
    }
    if ((mN & 1) == 0) {
      t = t.add(new Q(Binomial.catalan(mN / 2 - 1).multiply(mN - 4), Z.EIGHT));
    }
    return t.toZ();
  }
}
