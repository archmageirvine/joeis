package irvine.oeis.a284;
// Generated by gen_seq4.pl dirtraf at 2024-02-03 12:35

import irvine.oeis.a005.A005361;
import irvine.oeis.a283.A283477;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A284001 a(n) = A005361(A283477(n)).
 * @author Georg Fischer
 */
public class A284001 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A284001() {
    super(0, new A005361(), new A283477());
  }
}
