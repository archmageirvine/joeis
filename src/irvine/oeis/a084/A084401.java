package irvine.oeis.a084;
// manually deris/essent at 2021-12-09 19:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a036.A036012;

/**
 * A084401 n-th partial product + 1 is a prime, where a(n)&gt;1 for n&gt;1.
 * @author Georg Fischer
 */
public class A084401 extends PrependSequence {

  /** Construct the sequence. */
  public A084401() {
    super(new A036012(), 1);
  }
}
