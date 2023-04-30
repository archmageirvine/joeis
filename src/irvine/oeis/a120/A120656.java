package irvine.oeis.a120;
// manually verified, 2023-04-29

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A120656 a(n) = (-4 + (-2)^n + 2*3^(n+1))/3 - [n=0].
 * @author Georg Fischer
 */
public class A120656 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A120656() {
    super(0, "[0, 6,-5,-2, 1]", "[0, 4, 18, 50]", 0);
  }
}
