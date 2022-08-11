package irvine.oeis.a082;
// manually rectoproc/holos at 2022-08-11 09:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A082425 a(1)=1, a(n) = n*(a(n-1) + a(n-2) + ... + a(2) + a(1)) - 1.
 * @author Georg Fischer
 */
public class A082425 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A082425() {
    super(0, "[[0],[1,-1],[2, 1],[-1]]", "1, 1, 5", -1);
  }
}
