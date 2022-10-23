package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059288 a(n) = binomial(2*n,n) mod n.
 * @author Sean A. Irvine
 */
public class A059288 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN).mod(Z.valueOf(mN));
  }
}
