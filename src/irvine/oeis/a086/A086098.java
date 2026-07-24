package irvine.oeis.a086;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086098 Sum of rank(M) over all n X n matrices over GF(2).
 * @author Sean A. Irvine
 */
public class A086098 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN,
      r -> Integers.SINGLETON.product(0, r - 1, j -> Z.ONE.shiftLeft(mN).subtract(Z.ONE.shiftLeft(j)).square())
        .divide(Integers.SINGLETON.product(0, r - 1, j -> Z.ONE.shiftLeft(r).subtract(Z.ONE.shiftLeft(j))))
        .multiply(r));
  }
}

