package irvine.oeis.a152;
// manually robots/union2 at 2023-08-23 09:55

import irvine.oeis.ComplementSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a009.A009994;
import irvine.oeis.a009.A009996;

/**
 * A152054 Bouncy numbers (numbers whose digits are in neither increasing nor decreasing order).
 * @author Georg Fischer
 */
public class A152054 extends ComplementSequence {

  /** Construct the sequence. */
  public A152054() {
    super(1, new UnionSequence(1, new A009994(), new A009996()));
  }
}
