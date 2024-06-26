package irvine.oeis.a241;
// Generated by gen_seq4.pl simple/simbinom at 2023-03-20 18:29

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A241907 a(n) = floor( Catalan(2*n) / Catalan(n)^2 ).
 * @author Georg Fischer
 */
public class A241907 extends AbstractSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A241907() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return Functions.CATALAN.z(2L * mN).divide(Functions.CATALAN.z(mN).square());
  }
}
