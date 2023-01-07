package irvine.oeis.a358;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A358607 a(n) = Sum_{k=0..floor(n/2)} (-1)^k * (n-2*k)!.
 * @author Georg Fischer
 */
public class A358607 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A358607() {
    super(0, "[[0],[0,1],[-1],[0,1],[-1]]", "1", 0);
  }
}
