package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263418 a(n) is the total number of pentagrams in a variant of pentagram fractal after n iterations.
 * @author Sean A. Irvine
 */
public class A263418 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263418() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 6, 21, 51});
  }
}
