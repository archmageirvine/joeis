package irvine.oeis.a389;

import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a380.A380543;

/**
 * A389394 Powers k^m, m &gt; 1, where k is neither squarefree nor squareful and A006530(k) &lt; A053669(k).
 * @author Sean A. Irvine
 */
public class A389394 extends TwoParameterFormSequence {

  private static final DirectSequence S = DirectSequence.create(new A380543());

  /** Construct the sequence. */
  public A389394() {
    super(1, 0, 2, (n, m) -> S.a(n.intValue()).pow(m));
  }
}
