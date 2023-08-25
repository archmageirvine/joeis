package irvine.oeis.a321;
// manually robots/union2 at 2023-08-23 09:55

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000290;
import irvine.oeis.a062.A062503;
import irvine.oeis.a320.A320965;

/**
 * A321070 Squares divisible by more than one cube &gt; 1.
 * @author Georg Fischer
 */
public class A321070 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A321070() {
    super(1, new A000290(), new UnionSequence(1, new A062503(), new A320965()));
    super.next();
  }
}
