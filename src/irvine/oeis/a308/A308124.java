package irvine.oeis.a308;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A308124 a(n) = (2 + 7*4^n)/3.
 * @author Georg Fischer
 */
public class A308124 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A308124() {
    super(0, "[0, 4,-5, 1]", "[3, 10]", 0);
  }
}
