package irvine.oeis.a358;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A358608 a(n) = Sum_{k=0..floor(n/3)} (-1)^k * (n-3*k)!.
 * @author Georg Fischer
 */
public class A358608 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A358608() {
    super(0, "[[0],[0,1],[-1],[0],[0,1],[-1]]", "1", 0);
  }
}
