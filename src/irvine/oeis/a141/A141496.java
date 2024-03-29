package irvine.oeis.a141;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A141496 a(0)=1; a(1)=5; a(2)=11; a(n)=a(1)*a(n-1).
 * @author Georg Fischer
 */
public class A141496 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A141496() {
    super(0, "[0,-5, 1]", "[1, 5, 11]", 0);
  }
}
