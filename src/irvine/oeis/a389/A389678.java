package irvine.oeis.a389;

import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a386.A386294;

/**
 * A389678 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A389678 extends TwoParameterFormSequence {

  private static final DirectSequence S = DirectSequence.create(new A386294());

  /** Construct the sequence. */
  public A389678() {
    super(1, 0, 2, (n, m) -> S.a(n.intValue()).pow(m));
  }
}
