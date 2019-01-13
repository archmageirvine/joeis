package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022524.
 * @author Sean A. Irvine
 */
public class A022524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022524() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 255, 6305, 58975, 325089, 1288991, 4085185, 11012415});
  }
}
