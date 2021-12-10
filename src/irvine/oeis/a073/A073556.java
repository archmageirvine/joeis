package irvine.oeis.a073;
// manually deris/essent at 2021-12-09 19:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a097.A097166;

/**
 * A073556 Number of Fibonacci numbers F(k), k &lt;= 10^n, which end in 9.
 * @author Georg Fischer
 */
public class A073556 extends PrependSequence {

  /** Construct the sequence. */
  public A073556() {
    super(1, new A097166(), 0);
  }
}
