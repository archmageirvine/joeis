package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133586.
 * @author Sean A. Irvine
 */
public class A133586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133586() {
    super(new long[] {-1, 0, 3, 0}, new long[] {1, 2, 3, 6});
  }
}
