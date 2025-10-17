package irvine.oeis.a389;

import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a386.A386223;

/**
 * A389397 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A389397 extends TwoParameterFormSequence {

  private static final DirectSequence S = DirectSequence.create(new A386223());

  /** Construct the sequence. */
  public A389397() {
    super(1, 0, 2, (n, m) -> S.a(n.intValue()).pow(m));
  }
}
