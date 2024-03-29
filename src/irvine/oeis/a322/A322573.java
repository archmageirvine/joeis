package irvine.oeis.a322;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A322573 G.f. = g(f(x)), where f(x) = g.f. of Fibonacci sequence A000045 and g(x) = g.f. of Jacobsthal sequence A001045.
 * @author Georg Fischer
 */
public class A322573 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A322573() {
    super(0, "[0, 1, 3,-2,-3, 1]", "[0, 1, 2, 7]", 0);
  }
}
