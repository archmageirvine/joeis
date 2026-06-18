package irvine.oeis.a085;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085404 Number of n X n matrices over GF(4) with rank n-1.
 * @author Sean A. Irvine
 */
public class A085404 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z t = Z.ONE.shiftLeft(2 * mN);
    final Z u = Z.ONE.shiftLeft(2 * (mN - 1));
    return Integers.SINGLETON.product(0, mN - 2, k -> t.subtract(Z.ONE.shiftLeft(2 * k)).square())
      .divide(Integers.SINGLETON.product(0, mN - 2, k -> u.subtract(Z.ONE.shiftLeft(2 * k))));
  }
}

