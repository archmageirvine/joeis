package irvine.oeis.a250;
// Generated by gen_seq4.pl simbinom at 2023-03-17 21:33

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A250222 a(n) = phi(2n+1) - phi(2n), where phi is A000010.
 * @author Georg Fischer
 */
public class A250222 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A250222() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Functions.PHI.z(2L * mN + 1).subtract(Functions.PHI.z(2L * mN));
  }
}
