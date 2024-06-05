package irvine.oeis.a117;
// manually simbinom at 2023-03-17 20:00

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A117295 a(n) = phi(n)*(n - phi(n)).
 * @author Georg Fischer
 */
public class A117295 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A117295() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ZERO : Functions.PHI.z(mN).multiply(mN - Functions.PHI.l(mN));
  }
}
