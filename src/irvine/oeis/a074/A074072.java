package irvine.oeis.a074;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074072 Numerators of iterations of Thue-Morse sequence.
 * @author Sean A. Irvine
 */
public class A074072 extends Sequence0 {

  private long mN = -1;
  private Q mA = Q.ZERO;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN > 0) {
      final Z t = Z.ONE.shiftLeft(1L << (mN - 1));
      mA = mA.multiply(t).add(1).divide(Z.ONE.shiftLeft(1L << mN)).multiply(t.subtract(1));
    }
    return select(mA);
  }
}
