package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259278.
 * @author Sean A. Irvine
 */
public class A259278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259278() {
    super(new long[] {1, 1, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 2});
  }
}
