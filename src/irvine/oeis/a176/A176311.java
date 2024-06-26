package irvine.oeis.a176;
// Generated by gen_seq4.pl simbinom at 2023-03-17 21:33

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A176311 a(n) = sigma(n*2^n).
 * @author Georg Fischer
 */
public class A176311 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A176311() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Functions.SIGMA1.z(Z.ONE.shiftLeft(mN).multiply(mN));
  }
}
