package irvine.oeis.a358;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A358611 a(n) = Sum_{k=0..floor(n/5)} (-1)^k * (n-5*k)!.
 * @author Georg Fischer
 */
public class A358611 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A358611() {
    super(0, "[[0],[0,1],[-1],[0],[0],[0],[0,1],[-1]]", "1", 0);
  }
}
