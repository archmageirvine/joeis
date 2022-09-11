package irvine.oeis.a093;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A093858 a(0) = 1, a(1)= 2, a(n) = (a(n+1) - a(n-1))/n, or a(n+1) = n*a(n) + a(n-1).
 * @author Georg Fischer
 */
public class A093858 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A093858() {
    super(0, "[[0],[1],[-1, 1],[-1]]", "[1, 2]", 0);
  }
}
