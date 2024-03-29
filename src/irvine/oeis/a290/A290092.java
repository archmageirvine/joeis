package irvine.oeis.a290;
// Generated by gen_seq4.pl dirtraf at 2023-11-18 23:07

import irvine.oeis.a278.A278222;
import irvine.oeis.a289.A289814;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A290092 Filter based on 2-digits of base-3 expansion: a(n) = A278222(A289814(n)).
 * @author Georg Fischer
 */
public class A290092 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A290092() {
    super(0, new A278222(), new A289814());
  }
}
