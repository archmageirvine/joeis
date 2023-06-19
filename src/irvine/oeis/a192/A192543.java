package irvine.oeis.a192;
// manually deris2/essent at 2021-11-04

import irvine.oeis.PrependSequence;
import irvine.oeis.a034.A034887;

/**
 * A192543 Let r be the largest real zero of x^n - x^(n-1) - x^(n-2) - ... - 1 = 0. Then a(n) is the value of k which satisfies the equation 0.5/10^k &lt; 2 - r &lt; 5/10^k.
 * @author Georg Fischer
 */
public class A192543 extends PrependSequence {

  /** Construct the sequence. */
  public A192543() {
    super(new A034887().skip(1), 0);
  }
}
