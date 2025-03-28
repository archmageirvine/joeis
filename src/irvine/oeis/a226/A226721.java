package irvine.oeis.a226;
// Generated by gen_seq4.pl 2024-11-10.ack/lambdan at 2024-11-10 23:25

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a066.A066344;

/**
 * A226721 Position of 2^n in the joint ranking of all the numbers 2^j for j&gt;=0 and 5^k for k&gt;=1; complement of A123384.
 * @author Georg Fischer
 */
public class A226721 extends LambdaSequence {

  private static final DirectSequence A066344 = new A066344();

  /** Construct the sequence. */
  public A226721() {
    super(1, n -> Z.ONE.add(A066344.a(n)));
  }
}
