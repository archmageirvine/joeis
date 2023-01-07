package irvine.oeis.a358;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A358603 a(n) = Sum_{k=0..floor(n/2)} (-1)^k * (n-k)!/(n-2*k)!.
 * @author Georg Fischer
 */
public class A358603 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A358603() {
    super(0, "[[1],[0,-1],[1],[-2]]", "1", 0);
  }
}
