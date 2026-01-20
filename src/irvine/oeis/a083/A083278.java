package irvine.oeis.a083;

import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a002.A002275;

/**
 * A083278 Repunit powers.
 * @author Sean A. Irvine
 */
public class A083278 extends TwoParameterFormSequence {

  private static final DirectSequence REPUNIT = DirectSequence.create(new A002275());

  /** Construct the sequence. */
  public A083278() {
    super(1, 1, 1, (n, e) -> n == 1 && e > 1 ? null : REPUNIT.a(n.intValue()).pow(e));
  }
}
