package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192080.
 * @author Sean A. Irvine
 */
public class A192080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192080() {
    super(new long[] {6, -15, 20, -15, 6}, new long[] {1, 6, 21, 56, 126});
  }
}
