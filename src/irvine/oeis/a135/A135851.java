package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135851.
 * @author Sean A. Irvine
 */
public class A135851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135851() {
    super(new long[] {1, 0, 1}, new long[] {-1, 0, 1});
  }
}
