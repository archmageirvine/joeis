package irvine.oeis.a145;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A145222 a(n) is the number of odd permutations (of an n-set) with exactly 1 fixed point.
 * Recurrence: (-n+3)*a(n) +n*(n-4)*a(n-1) +n*(n-1)*a(n-2)=0.
 * @author Georg Fischer
 */
public class A145222 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A145222() {
    super(1, "[[0],[0,-1, 1],[0,-4, 1],[3,-1]]", "0, 0, 3", 0);
  }
}
