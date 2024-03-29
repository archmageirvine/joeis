package irvine.oeis.a137;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A137607 a(0)=361, a(n+1)=a(n)/2 if a(n) is even, else a(n+1)=a(0)-(a(n)+1)/2.
 * @author Georg Fischer
 */
public class A137607 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A137607() {
    super(0, "[0,-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1]", "[361, 180, 90, 45, 338, 169, 276, 138, 69, 326, 163, 279, 221, 250, 125, 298, 149, 286, 143, 289, 216, 108, 54, 27, 347, 187, 267, 227, 247, 237, 242, 121, 300, 150, 75, 323, 199, 261, 230, 115, 303, 209, 256, 128, 64, 32, 16, 8, 4, 2, 1, 360]", 0);
  }
}
