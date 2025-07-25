package irvine.oeis.a236;
// Generated by gen_seq4.pl 2025-07-11.ack/sintrif at 2025-07-11 21:53

import irvine.math.function.Functions;
import irvine.oeis.a034.A034856;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A236999 Odd part of n*(n+3)/2-1 (A034856).
 * @author Georg Fischer
 */
public class A236999 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A236999() {
    super(1, (term, n) -> Functions.MAKE_ODD.z(term), "", new A034856());
  }
}
