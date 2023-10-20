package irvine.oeis.a087;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A087047 a(n) = n*(n+1)*(n+2)*a(n-1)/6 for n &gt;= 1; a(0) = 1.
 * @author Georg Fischer
 */
public class A087047 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A087047() {
    super(0, "[[0],[0,-2,-3,-1],[6]]", "[1,1]", 0);
  }
}
