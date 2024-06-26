package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A003450 Number of nonequivalent dissections of an n-gon into n-4 polygons by nonintersecting diagonals up to rotation and reflection.
 * @author Sean A. Irvine
 */
public class A003450 extends AbstractSequence {

  /** Construct the sequence. */
  public A003450() {
    super(5);
  }

  private long mN = 4;

  @Override
  public Z next() {
    ++mN;
    Q t1 = new Q(Functions.CATALAN.z(mN - 2).multiply(mN - 4).multiply(mN - 3).multiply(mN - 3), Z.valueOf(2 * mN - 5).multiply(mN).multiply(8));
    if ((mN & 1) == 0) {
      t1 = t1.add(new Q(3, 16).multiply(mN - 4).multiply(mN - 1).divide(mN - 3).multiply(Functions.CATALAN.z(mN / 2 - 1)));
    } else {
      t1 = t1.add(new Q(Z.valueOf(mN).subtract(2).multiply(mN).subtract(11), Z.valueOf(mN - 4).multiply(8)).multiply(Functions.CATALAN.z((mN - 3) / 2)));
    }
    if (mN % 5 == 0) {
      t1 = t1.add(new Q(Functions.CATALAN.z(mN / 5 - 1).multiply2(), Z.FIVE));
    }
    return t1.toZ();
  }
}
