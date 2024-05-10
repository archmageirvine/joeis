package irvine.oeis.a082;
// manually rectoproc/holos at 2022-08-11 09:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A082425 a(1)=1, a(n) = -1 + n*Sum_{j=1..n-1} a(j).
 * @author Georg Fischer
 */
public class A082425 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A082425() {
    super(1, "[[1],[0,0,1],[1,-1]]", "1,1", 0);
  }
}
