package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082635 Square array read by antidiagonals: degree of the K(2,p)^q variety.
 * @author Sean A. Irvine
 */
public class A082635 extends Sequence1 {

  private int mN = 0;
  private int mM = -1;

  private Z degK2(final int p, final int q) {
    final Z t = Functions.FACTORIAL.z(2 * p + p * q + 2 * q);
    return Integers.SINGLETON.sum(0, q, j -> t.multiply((q - 2L * j) * (p + 2) + 1)
      .divide(Functions.FACTORIAL.z(p + j * (p + 2)))
      .divide(Functions.FACTORIAL.z(p + 1 + (q - j) * (p + 2))))
      .multiply(Z.NEG_ONE.pow(q));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return degK2(mN - mM + 1, mM);
  }
}
