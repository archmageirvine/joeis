package irvine.oeis.a156;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A156752 a(n) = floor(Catalan(n+1)/Catalan(n)).
 * @author Georg Fischer
 */
public class A156752 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A156752() {
    super(0, "[0,-1, 1]", "[1, 2, 2, 2, 3]", 0);
  }
}
