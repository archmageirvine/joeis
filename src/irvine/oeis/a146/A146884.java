package irvine.oeis.a146;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A146884 a(n) = 7*Sum_{k=0..n} 6^k.
 * @author Georg Fischer
 */
public class A146884 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A146884() {
    super(0, "[[0],[-6],[7],[-1]]", "7", 0);
  }
}
