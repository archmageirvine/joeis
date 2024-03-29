package irvine.oeis.a086;
// generated by patch_offset.pl at 2023-06-16 18:27

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a006.A006165;

/**
 * A086694 A run of 2^n 1's followed by a run of 2^n 0's, for n=0, 1, 2, ...
 * @author Georg Fischer
 */
public class A086694 extends DifferenceSequence {

  /** Construct the sequence. */
  public A086694() {
    super(1, new A006165());
    next();
  }
}
