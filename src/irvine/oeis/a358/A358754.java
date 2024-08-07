package irvine.oeis.a358;
// Generated by gen_seq4.pl 2024-07-21/lambdan at 2024-07-22 00:06

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a053.A053669;

/**
 * A358754 a(n) = 1 if A053669(n) [the smallest prime not dividing n] is of the form 6m+1, otherwise a(n) = 0.
 * @author Georg Fischer
 */
public class A358754 extends LambdaSequence {

  private static final DirectSequence A053669 = new A053669();

  /** Construct the sequence. */
  public A358754() {
    super(1, n -> A053669.a(n).mod(6) == 1 ? Z.ONE : Z.ZERO);
  }
}
