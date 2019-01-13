package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274756.
 * @author Sean A. Irvine
 */
public class A274756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274756() {
    super(new long[] {1, -1, -37634, 37634, 1}, new long[] {0, 945, 13167, 35578242, 495540990});
  }
}
