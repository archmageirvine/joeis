package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155757 <code>(n^3 - n + 15)/3</code>.
 * @author Sean A. Irvine
 */
public class A155757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155757() {
    super(new long[] {-1, 4, -6, 4}, new long[] {5, 7, 13, 25});
  }
}
