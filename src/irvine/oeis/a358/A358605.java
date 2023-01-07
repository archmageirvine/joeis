package irvine.oeis.a358;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A358605 a(n) = Sum_{k=0..floor(n/4)} (-1)^k * (n-3*k)!/(n-4*k)!.
 * @author Georg Fischer
 */
public class A358605 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A358605() {
    super(0, "[[1],[0,-1],[0],[0],[3],[-4]]", "1", 0);
  }
}
