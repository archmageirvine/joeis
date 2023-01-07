package irvine.oeis.a356;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A356012 a(n) = n! / (6 * floor(n/3)).
 * @author Georg Fischer
 */
public class A356012 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A356012() {
    super(0, "[[0],[-20,-29,-10,-1],[-5,-1],[-1],[1]]", "1,4,20", 3);
  }
}
