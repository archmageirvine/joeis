package irvine.oeis.a062;

import irvine.oeis.FilterSequence;
import irvine.oeis.a022.A022544;

/**
 * A062316 Neither the sum or difference of 2 squares.
 * @author Sean A. Irvine
 */
public class A062316 extends FilterSequence {

  /** Construct the sequence. */
  public A062316() {
    super(new A022544(), k -> k.mod(4) == 2);
  }
}
