package irvine.oeis.a329;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A329244 Sum of every third term of the Padovan sequence A000931.
 * @author Georg Fischer
 */
public class A329244 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A329244() {
    super(0, "[0, 1,-3, 5,-4, 1]", "[1, 2, 3, 5]", 0);
  }
}
