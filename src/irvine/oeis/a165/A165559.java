package irvine.oeis.a165;
// Generated by gen_seq4.pl 2024-05-25/lambdan at 2024-05-25 23:20

import irvine.math.z.Integers;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a003.A003415;

/**
 * A165559 Product of the arithmetic derivatives from 2 to n.
 * @author Georg Fischer
 */
public class A165559 extends LambdaSequence {

  private static final DirectSequence A003415 = new A003415();

  /** Construct the sequence. */
  public A165559() {
    super(2, n -> Integers.SINGLETON.product(2, n, k -> A003415.a(k)));
  }
}
