package irvine.oeis.a145;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A145223 a(n) is the number of odd permutations (of an n-set) with exactly 2 fixed points.
 * Recurrence: +(-n+6)*a(n) +(n-2)*(n-7)*a(n-1) +(n-2)*(n-3)*a(n-2)=0.
 * @author Georg Fischer
 */
public class A145223 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A145223() {
    super(2, "[[0],[6,-5, 1],[14,-9, 1],[6,-1]]", "0, 0, 6, 0, 90", -2);
  }
}
