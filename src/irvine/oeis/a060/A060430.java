package irvine.oeis.a060;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060430 Residue C(2^n,n) mod C(2^n,2).
 * @author Sean A. Irvine
 */
public class A060430 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z up = Z.ONE.shiftLeft(++mN);
    return Binomial.binomial(up, Z.valueOf(mN)).mod(Binomial.binomial(up, Z.TWO));
  }
}

