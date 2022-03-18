package irvine.oeis.a076;
// manually deris/essent at 2021-12-09 19:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a036.A036441;

/**
 * A076271 a(1) = 1, a(2) = 2, and for n &gt; 2, a(n) = a(n-1) + gpf(a(n-1)), where gpf = greatest prime factor = A006530.
 * @author Georg Fischer
 */
public class A076271 extends PrependSequence {

  /** Construct the sequence. */
  public A076271() {
    super(new A036441(), 1);
  }
}
