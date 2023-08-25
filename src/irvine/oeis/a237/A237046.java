package irvine.oeis.a237;
// manually robots/union2 at 2023-08-23 09:55

import irvine.oeis.ComplementSequence;
import irvine.oeis.a103.A103288;

/**
 * A237046 Numbers n such that sigma(n) &lt; 2n-1.
 * @author Georg Fischer
 */
public class A237046 extends ComplementSequence {

  /** Construct the sequence. */
  public A237046() {
    super(1, new A103288());
    super.next();
  }
}

