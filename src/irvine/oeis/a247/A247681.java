package irvine.oeis.a247;
// manually 2023-08-30/filter at 2023-08-31 21:50

import irvine.oeis.FilterSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002808;

/**
 * A247681 Odd nonprimes congruent to 1 modulo 9.
 * @author Georg Fischer
 */
public class A247681 extends PrependSequence {

  /** Construct the sequence. */
  public A247681() {
    super(1, new FilterSequence(1, new A002808(), t -> t.mod(18) == 1), 1);
  }
}
