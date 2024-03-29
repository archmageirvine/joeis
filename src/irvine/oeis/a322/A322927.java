package irvine.oeis.a322;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A322927 Expansion of x*(1 + 5*x + 40*x^2)/((1 - x^2)*(1 - 10*x^2)).
 * @author Georg Fischer
 */
public class A322927 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A322927() {
    super(0, "[[0],[10],[0],[-11],[0],[1]]", "[0, 1, 5, 51, 55]", 0);
  }
}
