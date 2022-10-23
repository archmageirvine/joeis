package irvine.oeis.a042;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A042970 a(n) = binomial(n, floor(n/2)) mod n.
 * @author Sean A. Irvine
 */
public class A042970 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Binomial.binomial(++mN, mN / 2).mod(mN));
  }
}
