package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061317.
 * @author Sean A. Irvine
 */
public class A061317 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061317() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 3, 18, 57});
  }
}
