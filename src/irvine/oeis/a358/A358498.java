package irvine.oeis.a358;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A358498 a(n) = Sum_{k=0..floor(n/3)} (n-3*k)!.
 * @author Georg Fischer
 */
public class A358498 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A358498() {
    super(0, "[[0],[0,-1],[1],[0],[0,1],[-1]]", "1,1,2", 0);
  }
}
