package irvine.oeis.a243;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A243134 128*n^8 - 256*n^6 + 160*n^4 - 32*n^2 + 1.
 * @author Sean A. Irvine
 */
public class A243134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243134() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 1, 18817, 665857, 7380481, 46099201, 203253121, 708158977, 2081028097});
  }
}
