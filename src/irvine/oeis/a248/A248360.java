package irvine.oeis.a248;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A248360 a(n) = floor( 1/(1 - cos(Pi/n)) ).
 * @author Georg Fischer
 */
public class A248360 extends FloorSequence {
  /** Construct the sequence. */
  public A248360() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.ONE.divide(CR.ONE.subtract(CR.PI.divide(CR.valueOf(n)).cos())).floor();
  }

}
