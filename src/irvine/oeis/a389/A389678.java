package irvine.oeis.a389;

import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a386.A386294;

/**
 * A389678 Powers k^m, m &gt; 1, where k is neither squarefree nor squareful and A053669(k) &lt; A006530(k).
 * @author Sean A. Irvine
 */
public class A389678 extends TwoParameterFormSequence {

  private static final DirectSequence S = DirectSequence.create(new A386294());

  /** Construct the sequence. */
  public A389678() {
    super(1, 0, 2, (n, m) -> S.a(n.intValue()).pow(m));
  }
}
