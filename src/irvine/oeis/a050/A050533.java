package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050533.
 * @author Sean A. Irvine
 */
public class A050533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050533() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 5, 22, 59});
  }
}
