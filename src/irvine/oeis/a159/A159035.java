package irvine.oeis.a159;
// manually linrec 2021-09-26

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A159035 a(0)=1=a(1), a(2)=2, a(3)=5; thereafter a(n+3)=4*a(n+2)-4*a(n+1)+2*a(n) for n&gt;=1.
 * @author Georg Fischer
 */
public class A159035 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A159035() {
    super(0, "[[0],[2],[-4],[4],[-1]]", "[1, 1, 2, 5]", 0);
  }
}
