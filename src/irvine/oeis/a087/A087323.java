package irvine.oeis.a087;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A087323 a(n) = (n+1) * 2^n - 1.
 * @author Georg Fischer
 */
public class A087323 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A087323() {
    super(0, "[0,-4, 8,-5, 1]", "[0, 3, 11]", 0);
  }
}
