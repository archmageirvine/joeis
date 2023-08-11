package irvine.oeis.a114;
// manually 2023-08-10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A114698 Let M(n) be the n X n matrix m(i,j)=min(i,j) for 1<=i,j<=n then a(n) is the trace of M(n)^(-3).
 * @author Georg Fischer
 */
public class A114698 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A114698() {
    super(1, "[0,1,-2,1]", "[1,18,38]", 0);
  }
}
