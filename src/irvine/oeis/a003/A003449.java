package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003449 Number of nonequivalent dissections of an n-gon into n-3 polygons by nonintersecting diagonals up to rotation and reflection.
 * @author Sean A. Irvine
 */
public class A003449 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    ++mN;
    Q t1 = new Q(mN - 3, 4 * mN).multiply(Binomial.catalan(mN - 2));
    if ((mN & 1) == 0) {
      t1 = t1.add(new Q(3, 8).multiply(Binomial.catalan(mN / 2 - 1)))
        .add(new Q(mN - 3, mN).multiply(Binomial.catalan(mN / 2 - 2)));
      if ((mN & 3) == 0) {
        t1 = t1.add(new Q(Binomial.catalan(mN / 4 - 1), Z.FOUR));
      }
    } else {
      t1 = t1.add(new Q(Binomial.catalan((mN - 3) / 2), Z.TWO));
    }
    return t1.toZ();
  }
}
