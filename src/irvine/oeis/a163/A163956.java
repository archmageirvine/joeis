package irvine.oeis.a163;
// Generated by gen_seq4.pl dirtraf at 2024-02-03 12:35

import irvine.oeis.a002.A002997;
import irvine.oeis.a007.A007733;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A163956 Multiplicative order of 2 in Z/mZ with m = A002997(n).
 * @author Georg Fischer
 */
public class A163956 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A163956() {
    super(1, new A007733(), new A002997());
  }
}
