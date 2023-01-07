package irvine.oeis.a358;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A358604 a(n) = Sum_{k=0..floor(n/3)} (-1)^k * (n-2*k)!/(n-3*k)!.
 * @author Georg Fischer
 */
public class A358604 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A358604() {
    super(0, "[[1],[0,-1],[0],[2],[-3]]", "1", 0);
  }
}
