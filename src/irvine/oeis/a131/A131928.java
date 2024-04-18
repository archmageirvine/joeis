package irvine.oeis.a131;
// manually simbinom at 2023-03-17 20:00

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A131928 a(n) = phi(binomial(2*n,n)*n).
 * @author Georg Fischer
 */
public class A131928 extends AbstractSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A131928() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ZERO : Functions.PHI.z(Binomial.binomial(2L * mN, mN).multiply(mN));
  }
}
