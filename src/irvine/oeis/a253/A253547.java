package irvine.oeis.a253;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A253547 Total number of star-shaped dodecagons appearing in a variant of hexagon expansion after n iterations.
 * @author Georg Fischer
 */
public class A253547 extends LinearRecurrence implements Conjectural {

  /** Construct the sequence. */
  public A253547() {
    super(1, new long[] {1L, -2L, 0L, 2L}, new long[] {9L, 16L, 23L, 33L}, 0L, 0L, 0L, 1L, 3L);
  } // constructor()
} // A253547
