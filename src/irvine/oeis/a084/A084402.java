package irvine.oeis.a084;
// manually deris/essent at 2021-12-09 19:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a036.A036013;

/**
 * A084402 n-th partial product - 1 is a prime, where a(n) &gt; 1.
 * @author Georg Fischer
 */
public class A084402 extends PrependSequence {

  /** Construct the sequence. */
  public A084402() {
    super(new A036013().skip(4), 3, 2, 2, 2);
  }
}
