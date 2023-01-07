package irvine.oeis.a358;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A358547 a(n) = Sum_{k=0..floor(n/3)} (n-k)!/(n-3*k)!.
 * @author Georg Fischer
 */
public class A358547 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A358547() {
    super(0, "[[-6,4],[0,6,-10,4],[0,-1],[-3,6],[9,-9]]", "1,1", 0);
  }
}
