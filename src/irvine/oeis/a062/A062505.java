package irvine.oeis.a062;

import irvine.oeis.closure.MultiplicativeClosureSequence;
import irvine.oeis.a001.A001097;

/**
 * A062505 Numbers k such that if p is a prime that divides k, then either p + 2 or p - 2 is also prime.
 * @author Sean A. Irvine
 */
public class A062505 extends MultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A062505() {
    super(new A001097());
    setOffset(1);
  }
}
