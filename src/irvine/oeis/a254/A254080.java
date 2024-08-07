package irvine.oeis.a254;
// Generated by gen_seq4.pl 2024-08-04/lambdan at 2024-08-04 18:23

import irvine.oeis.LambdaSequence;
import irvine.oeis.triangle.DirectArray;

/**
 * A254080 Number of primitive (=aperiodic) n-bead necklaces with colored beads of exactly 8 different colors.
 * @author Georg Fischer
 */
public class A254080 extends LambdaSequence {

  private static final DirectArray A254040 = new A254040();

  /** Construct the sequence. */
  public A254080() {
    super(8, n -> A254040.a(n, 8));
  }
}
