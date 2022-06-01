package irvine.oeis.a092;
// manually 2021-01-21

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A092634 a(n) = 1 - Sum_{k=2..n} k*k!.
 * a(n) = 3 - (n+1)!
 * @author Georg Fischer
 */
public class A092634 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A092634() {
    super(2, "[[0, 3],[-1,-1],[1]]", "-3", 0);
  }
}
