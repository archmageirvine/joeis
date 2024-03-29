package irvine.oeis.a322;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A322925 Expansion of x*(1 + 2*x + 10*x^2)/((1 - x^2)*(1 - 10*x^2)).
 * @author Georg Fischer
 */
public class A322925 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A322925() {
    super(0, "[[0],[10],[0],[-11],[0],[1]]", "[0, 1, 2, 21, 22]", 0);
  }
}
