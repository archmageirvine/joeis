package irvine.oeis.a105;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A105067 a(n) = Sum_{j=0..11} n^j.
 * @author Georg Fischer
 */
public class A105067 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A105067() {
    super(0, "[0, 1,-12, 66,-220, 495,-792, 924,-792, 495,-220, 66,-12, 1]", "[1, 12, 4095, 265720, 5592405, 61035156, 435356467, 2306881200, 9817068105, 35303692060, 111111111111, 313842837672]", 0);
  }
}
