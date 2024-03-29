package irvine.oeis.a123;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A123358 Kekul\u00e9 numbers for certain benzenoids (see the Cyvin-Gutman book for details).
 * @author Georg Fischer
 */
public class A123358 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A123358() {
    super(0, "[0, 25,-15, 1]", "[1, 10]", 0);
  }
}
