package irvine.oeis.a106;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A106058 4th diagonal of triangle in A059317.
 * @author Georg Fischer
 */
public class A106058 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A106058() {
    super(0, "[0, 1,-4, 6,-4, 1]", "[0, 0, 0, 2, 9, 22]", 0);
  }
}
