package irvine.oeis.a075;
// Generated by gen_seq4.pl 2024-05-14/lambdir at 2024-05-14 21:53

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a008.A008908;

/**
 * A075486 Length of iteration list when Collatz-function is iterated with initial value 2^n + 1.
 * @author Georg Fischer
 */
public class A075486 extends LambdaSequence {

  private static final DirectSequence SEQ = new A008908();

  /** Construct the sequence. */
  public A075486() {
    super(1, n -> SEQ.a(Z.TWO.pow(n).add(1)));
  }
}
