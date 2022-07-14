package irvine.oeis.a300;
// manually rectoproc/holos at 2022-07-14 16:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A300125 Number of closable Motzkin trees.
 * @author Georg Fischer
 */
public class A300125 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A300125() {
    super(0, "[[0],[27648,-6528, 384],[1536, 64,-32],[-13008, 4432,-368],[-1944, 664,-56],[-1164, 260,-4],[1932,-946, 110],[-282, 177,-21],[-30, 51,-21],[0,-9, 9],[0,-1,-1]]", "[0, 1, 1, 2, 5, 11, 26, 65]", -1);
  }
}
