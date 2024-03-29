package irvine.oeis.a105;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A105280 a(0)=0; a(n) = 11*a(n-1) + 11.
 * @author Georg Fischer
 */
public class A105280 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A105280() {
    super(0, "[[-11],[-11],[1]]", "[0, 11]", 0);
  }
}
