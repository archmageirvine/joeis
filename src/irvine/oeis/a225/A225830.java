package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225830.
 * @author Sean A. Irvine
 */
public class A225830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225830() {
    super(new long[] {-4096, 64, 64}, new long[] {1, 36, 1072});
  }
}
