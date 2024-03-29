package irvine.oeis.a344;
// Generated by gen_seq4.pl 2024-01-16/dirtraf at 2024-01-19 19:57

import irvine.oeis.a003.A003415;
import irvine.oeis.a005.A005940;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A344026 Arithmetic derivative applied to the Doudna sequence: a(n) = A003415(A005940(1+n)).
 * @author Georg Fischer
 */
public class A344026 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A344026() {
    super(0, new A003415(), new A005940());
  }
}
