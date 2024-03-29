package irvine.oeis.a308;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A308422 a(n) = n^2 if n odd, 3*n^2/4 if n even.
 * @author Georg Fischer
 */
public class A308422 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A308422() {
    super(0, "[0,-1, 0, 3, 0,-3, 0, 1]", "[0, 1, 3, 9, 12, 25]", 0);
  }
}
