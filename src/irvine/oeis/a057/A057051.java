package irvine.oeis.a057;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057051 Number of polyominoes of 2n-1 cells that span an n X n square.
 * @author Sean A. Irvine
 */
public class A057051 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z t = Binomial.binomial(2L * mN - 2, mN - 1).add(Z.ONE.shiftLeft(mN - 2));
    if ((mN & 1) == 0) {
      return t.subtract((3L * mN * mN - 2L * mN + 8) / 8);
    } else {
      return t.subtract((3L * mN * mN - 4L * mN + 9) / 8).add(Binomial.binomial(mN - 1, (mN - 1) / 2).divide2());
    }
  }
}
