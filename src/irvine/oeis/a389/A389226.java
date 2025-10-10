package irvine.oeis.a389;

import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a377.A377854;

/**
 * A389226 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A389226 extends TwoParameterFormSequence {

  private static final DirectSequence A377854 = DirectSequence.create(new A377854());

  /** Construct the sequence. */
  public A389226() {
    super(1, 0, 2, (n, k) -> A377854.a(n.intValue()).pow(k));
  }
}
