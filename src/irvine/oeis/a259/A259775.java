package irvine.oeis.a259;
// manually 2024-03-28/ileave at 2024-04-02 14:42

import irvine.oeis.AlternatingSequence;
import irvine.oeis.a129.A129869;
import irvine.oeis.a220.A220101;

/**
 * A259775 Stepped path in P(k,n) array of k-th partial sums of squares (A000290).
 * @author Georg Fischer
 */
public class A259775 extends AlternatingSequence {

  /** Construct the sequence. */
  public A259775() {
    super(1, new A129869().skip(1), new A220101().skip(1));
    next();
  }
}
