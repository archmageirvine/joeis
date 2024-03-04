package irvine.oeis.a068;

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000217;

/**
 * A068622 a(1) = 5; a(n+1) = smallest triangular number &gt; a(n) formed by adding at least one digit to a(n).
 * @author Sean A. Irvine
 */
public class A068622 extends A068618 {

  /** Construct the sequence. */
  public A068622() {
    super(new PrependSequence(new A000217(), 5));
  }
}
