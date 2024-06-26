package irvine.oeis.a279;
// Generated by gen_seq4.pl 2024-05-24/dirtraf at 2024-05-24 21:50

import irvine.oeis.a003.A003418;
import irvine.oeis.a049.A049502;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A279519 a(n) = A049502(A003418(n)).
 * @author Georg Fischer
 */
public class A279519 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A279519() {
    super(0, new A049502(), new A003418());
  }
}
