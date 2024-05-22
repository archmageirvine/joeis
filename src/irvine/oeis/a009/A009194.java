package irvine.oeis.a009;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A009194 a(n) = gcd(n, sigma(n)).
 * @author Sean A. Irvine
 */
public class A009194 extends AbstractSequence implements DirectSequence {

  private Z mN;

  /** Construct the sequence. */
  public A009194() {
    super(1);
    mN = Z.ZERO;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    return n.gcd(Functions.SIGMA1.z(n));
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.gcd(Functions.SIGMA1.z(mN));
  }
}
