package irvine.oeis.a358;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A358500 a(n) = Sum_{k=0..floor(n/5)} (n-5*k)!.
 * @author Georg Fischer
 */
public class A358500 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A358500() {
    super(0, "[[0],[0,-1],[1],[0],[0],[0],[0,1],[-1]]", "1", 0);
  }
}
