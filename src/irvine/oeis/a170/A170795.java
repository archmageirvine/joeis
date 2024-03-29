package irvine.oeis.a170;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A170795 a(n) = n^10*(n^3 + 1)/2.
 * @author Georg Fischer
 */
public class A170795 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A170795() {
    super(0, "[0, 1,-14, 91,-364, 1001,-2002, 3003,-3432, 3003,-2002, 1001,-364, 91,-14, 1]", "[0, 1, 4608, 826686, 34078720, 615234375, 6560580096, 48585742828, 275414777856, 1272676306365, 5005000000000, 17274324784266, 53527561371648, 151506482542051]", 0);
  }
}
