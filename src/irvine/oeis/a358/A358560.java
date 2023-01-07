package irvine.oeis.a358;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A358560 a(n) = Sum_{k=0..floor(n/3)} (n-k)!/(k! * (n-3*k)!).
 * @author Georg Fischer
 */
public class A358560 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A358560() {
    super(0, "[[0],[-6,4],[-1],[4],[-3]]", "1,1", 0);
  }
}
