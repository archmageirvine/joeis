package irvine.oeis.a293;
// manually rectoproc/holos at 2022-07-14 16:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A293933 Poincar\u00e9 series for invariant polynomial functions on the space of binary forms of degree 7.
 * @author Georg Fischer
 */
public class A293933 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A293933() {
    super(0, "[[28260,-12562, 2473,-242, 11],[-12],[-60],[-168],[-348],[-588],[-852],[-1080],[-1212],[-1212],[-1080],[-852],[-588],[-348],[-168],[-60],[-12]]", "[1, 0, 1, 0, 4, 0, 10, 4, 18, 13, 35, 26, 62, 52, 97, 92, 153]", 0);
  }
}
