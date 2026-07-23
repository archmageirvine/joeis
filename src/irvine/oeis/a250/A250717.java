package irvine.oeis.a250;
// manually 2026-07-23/filter at 2026-07-23 11:15

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A250717 Primes of the form 4^x + y^4 with x, y &gt; 0.
 * @author Georg Fischer
 */
public class A250717 extends FilterSequence {

  /** Construct the sequence. */
  public A250717() {
    super(1, new TwoParameterFormSequence(1, 1, 1, (x, y) -> Z.FOUR.pow(x).add(Z.valueOf(y).pow(4))), PRIME);
  }
}
