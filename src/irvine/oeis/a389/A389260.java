package irvine.oeis.a389;

import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a378.A378002;

/**
 * A389260 Powers k^m, m &gt; 1, where k is an Achilles number that is a product of primorials.
 * @author Sean A. Irvine
 */
public class A389260 extends TwoParameterFormSequence {

  private static final DirectSequence A378002 = DirectSequence.create(new A378002());

  /** Construct the sequence. */
  public A389260() {
    super(1, 0, 2, (n, k) -> A378002.a(n.intValue()).pow(k));
  }
}
