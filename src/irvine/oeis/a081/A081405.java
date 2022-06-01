package irvine.oeis.a081;
// manually 

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A081405 a(n) = (n+1)*a(n-2) with a(0) = a(1) = 1.
 * @author Georg Fischer
 */
public class A081405 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A081405() {
    super(0, "[[0],[1, 1],[0],[-1]]", "[1, 1]", 0);
  }
}
