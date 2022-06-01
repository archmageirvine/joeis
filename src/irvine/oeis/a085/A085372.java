package irvine.oeis.a085;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A085372 If n = 0 or 1 then a(n) = 1; if n = 2, 3 or 4 then a(n) = 0; otherwise a(n) = (n+1)*a(n-1)-(n-2)*a(n-2)-(n-5)*a(n-3)+(n-3)*a(n-4).
 * @author Georg Fischer
 */
public class A085372 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A085372() {
    super(0, "[[0],[-3, 1],[5,-1],[2,-1],[1, 1],[-1]]", "1, 1, 0, 0, 0, 2", 0);
  }
}
