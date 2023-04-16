package irvine.oeis.a260;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A260636 a(n) = binomial(3n, n) mod n.
 * @author Georg Fischer
 */
public class A260636 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(3 * mN, mN).mod(Z.valueOf(mN));
  }
}
