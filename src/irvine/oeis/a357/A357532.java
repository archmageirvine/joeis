package irvine.oeis.a357;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A357532 a(n) = Sum_{k=0..floor(n/3)} (n-2*k)!/(n-3*k)!.
 * @author Georg Fischer
 */
public class A357532 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A357532() {
    super(0, "[[1],[0,1],[0],[2],[-3]]", "1", 0);
  }
}
