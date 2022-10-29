package irvine.oeis.a283;
// manually A283765/posubse at 2022-06-08 17:10

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a022.A022843;

/**
 * A283778 Numbers k such that floor(k*e) is odd.
 * @author Georg Fischer
 */
public class A283778 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A283778() {
    super(0, new A022843(), ODD);
  }
}
