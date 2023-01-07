package irvine.oeis.a358;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A358613 a(n) = Sum_{k=0..floor(n/3)} (-1)^k * (n-k)!/(k! * (n-3*k)!).
 * @author Georg Fischer
 */
public class A358613 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A358613() {
    super(0, "[[0],[6,-4],[-1],[4],[-3]]", "1,1", 0);
  }
}
