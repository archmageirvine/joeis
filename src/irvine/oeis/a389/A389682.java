package irvine.oeis.a389;

import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a386.A386224;

/**
 * A389682 Powers k^m, m &gt; 1, where k is neither squarefree nor squareful, and has a primorial kernel but is not a product of primorials.
 * @author Sean A. Irvine
 */
public class A389682 extends TwoParameterFormSequence {

  private static final DirectSequence SEQ = DirectSequence.create(new A386224());

  /** Construct the sequence. */
  public A389682() {
    super(1, 0, 2, (n, k) -> SEQ.a(n.intValue()).pow(k));
  }
}
