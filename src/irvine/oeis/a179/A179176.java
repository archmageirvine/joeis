package irvine.oeis.a179;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A179176 Number of vertices with even distance from the root in &quot;0-1-2&quot; Motzkin trees on n edges.
 * @author Georg Fischer
 */
public class A179176 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A179176() {
    // 3*(n+2)*(2*n-1)*a(n) -(4*n+5)*(2*n-1)*a(n-1) +(-20*n^2-8*n+27)*a(n-2) -3*(2*n+3)*(4*n-3)*a(n-3) -9*(2*n+3)*(n-1)*a(n-4)=0;
    super(0, "[[0],[27,-9,-18],[27,-18,-24],[27,-8,-20],[5,-6,-8],[-6,9,6]]", "1", 0);
  }
}
