package irvine.oeis.a284;
// Generated by gen_seq4.pl dirtraf at 2024-02-05 19:10

import irvine.oeis.a001.A001222;
import irvine.oeis.a283.A283983;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A284264 a(n) = A001222(A283983(n)).
 * @author Georg Fischer
 */
public class A284264 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A284264() {
    super(0, new A001222(), new A283983());
  }
}
