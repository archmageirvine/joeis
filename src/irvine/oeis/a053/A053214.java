package irvine.oeis.a053;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053214 Central binomial coefficients (A000984) read mod 2n, with a(0)=1.
 * @author Sean A. Irvine
 */
public class A053214 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Binomial.binomial(2 * mN, mN).mod(Z.valueOf(2 * mN));
  }
}
