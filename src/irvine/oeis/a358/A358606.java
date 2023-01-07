package irvine.oeis.a358;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A358606 a(n) = Sum_{k=0..floor(n/5)} (-1)^k * (n-4*k)!/(n-5*k)!.
 * @author Georg Fischer
 */
public class A358606 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A358606() {
    super(0, "[[1],[0,-1],[0],[0],[0],[4],[-5]]", "1", 0);
  }
}
