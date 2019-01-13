package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027993.
 * @author Sean A. Irvine
 */
public class A027993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027993() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 6, 20, 54});
  }
}
