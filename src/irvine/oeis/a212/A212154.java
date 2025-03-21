package irvine.oeis.a212;
// Generated by gen_seq4.pl 2025-02-03.ack/sintrif at 2025-02-03 18:14

import irvine.math.z.Z;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A212154 a(n) = (A212153(n)^3 + 1)/7^n, n &gt;= 0.
 * @author Georg Fischer
 */
public class A212154 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A212154() {
    super(0, (term, n) -> term.pow(3).add(1).divide(Z.SEVEN.pow(n)), "", new A212153());
  }
}
