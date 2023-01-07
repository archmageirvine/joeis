package irvine.oeis.a357;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A357533 a(n) = Sum_{k=0..floor(n/4)} (n-3*k)!/(n-4*k)!.
 * @author Georg Fischer
 */
public class A357533 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A357533() {
    super(0, "[[1],[0,1],[0],[0],[3],[-4]]", "1", 0);
  }
}
