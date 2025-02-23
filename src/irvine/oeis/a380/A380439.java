package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-01-31.ack/lambdan at 2025-01-31 23:19

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a003.A003557;

/**
 * A380439 a(n) = 1 if A003557(n)^2 &gt; n, otherwise 0, where A003557(n) is n divided by its squarefree kernel.
 * @author Georg Fischer
 */
public class A380439 extends LambdaSequence {

  private static final DirectSequence A003557 = new A003557();

  /** Construct the sequence. */
  public A380439() {
    super(1, n -> A003557.a(n).square().compareTo(Z.valueOf(n)) > 0 ? Z.ONE : Z.ZERO);
  }
}
