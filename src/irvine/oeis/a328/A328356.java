package irvine.oeis.a328;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A328356 a(n) is the sum of all positive integers whose decimal expansion is up to n digits and does not contain the 0 digit.
 * @author Georg Fischer
 */
public class A328356 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A328356() {
    super(0, "[0,-810, 909,-100, 1]", "[0, 45, 4500]", 0);
  }
}
