package irvine.oeis.a276;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A276086 Primorial base exp-function: digits in primorial base representation of n become the exponents of successive prime factors whose product a(n) is.
 * @author Georg Fischer
 */
public class A276086 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A276086() {
    super(0);
    mN = -1;
  }

  @Override
  public Z a(final Z n) {
    return Functions.PRIMORIAL_BASE_EXP.z(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.PRIMORIAL_BASE_EXP.z(n);
  }

  @Override
  public Z next() {
    return Functions.PRIMORIAL_BASE_EXP.z(++mN);
  }
}
