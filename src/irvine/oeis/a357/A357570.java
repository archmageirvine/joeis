package irvine.oeis.a357;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A357570 a(n) = Sum_{k=0..floor(n/5)} (n-4*k)!/(n-5*k)!.
 * @author Georg Fischer
 */
public class A357570 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A357570() {
    super(0, "[[1],[0,1],[0],[0],[0],[4],[-5]]", "1", 0);
  }
}
