package irvine.oeis.a069;
// Generated by gen_seq4.pl simbinom at 2023-03-17 21:33

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A069925 a(n) = phi(2^n+1)/(2*n).
 * @author Georg Fischer
 */
public class A069925 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A069925() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Functions.PHI.z(Z.ONE.shiftLeft(mN).add(1)).divide(2L * mN);
  }
}
