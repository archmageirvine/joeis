package irvine.oeis.a389;

import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a387.A387958;

/**
 * A389814 Powers k^m, m &gt; 1, where k is an Achilles number that is not a product of primorials.
 * @author Sean A. Irvine
 */
public class A389814 extends TwoParameterFormSequence {

  private static final DirectSequence SEQ = DirectSequence.create(new A387958());

  /** Construct the sequence. */
  public A389814() {
    super(1, 0, 2, (n, k) -> SEQ.a(n.intValue()).pow(k));
  }
}
