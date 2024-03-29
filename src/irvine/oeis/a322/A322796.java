package irvine.oeis.a322;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A322796 a(n) = Kronecker symbol (6/n).
 * @author Georg Fischer
 */
public class A322796 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A322796() {
    super(0, "[0, 1, 0, 0, 0,-1, 0, 0, 0, 1]", "[0, 1, 0, 0, 0, 1, 0,-1]", 0);
  }
}
