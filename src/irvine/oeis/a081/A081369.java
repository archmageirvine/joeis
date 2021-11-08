package irvine.oeis.a081;
// manually 2021-08-15

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A081369 Binomial(n^2, n) reduced mod n^2.
 * @author Georg Fischer
 */
public class A081369 implements Sequence {

  protected Z mN;

  /** Construct the sequence. */
  public A081369() {
    mN = Z.ZERO;
  }

  @Override
  public Z next() {
    mN = mN.add(Z.ONE);
    final Z n2 = mN.square();
    return Binomial.binomial(n2, mN).mod(n2);
  }
}
