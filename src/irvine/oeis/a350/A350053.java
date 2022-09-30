package irvine.oeis.a350;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A350053 a(n) = (2^(3*n + 3 + (-1)^n) - (6 + (-1)^n))/9, for n &gt;= 1.
 * @author Georg Fischer
 */
public class A350053 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A350053() {
    super(1, "[0,-64,0,65,0,-1]", "3,113,227,7281", 0);
  }
}
