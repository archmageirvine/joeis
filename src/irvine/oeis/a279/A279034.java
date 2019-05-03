package irvine.oeis.a279;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A279034 The sum of the necessary diagonal movements from each square unit of an <code>n X n+1</code> rectangle to reach any of the corners of the rectangle.
 * @author Georg Fischer
 */
public class A279034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279034() {
    super(new long[] {-1L, 1L, 2L, -2L, 0L, 0L, -2L, 2L, 1L}, new long[] {0L, 2L, 16L, 32L, 76L, 114L, 204L, 276L, 428L});
  } // constructor()
} // A279034
