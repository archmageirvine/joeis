package irvine.oeis.a308;
// Generated by gen_seq4.pl holos [0,64,-96,52,-12,1] [0,0,2,18] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A308700 a(n) = n * 2^(n - 2) * (2^(n - 1) - 1).
 * @author Georg Fischer
 */
public class A308700 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A308700() {
    super(1, "[0,64,-96,52,-12,1]", "[0,0,2,18]", 0);
  }
}
