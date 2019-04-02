package irvine.oeis.a043;

import irvine.oeis.LinearRecurrence;

/**
 * A043291 Every run length in base 2 is 2.
 * @author Sean A. Irvine
 */
public class A043291 extends LinearRecurrence {

  /** Construct the sequence. */
  public A043291() {
    super(new long[] {-4, 1, 4}, new long[] {3, 12, 51});
  }
}
