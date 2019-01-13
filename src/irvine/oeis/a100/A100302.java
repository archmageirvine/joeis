package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100302.
 * @author Sean A. Irvine
 */
public class A100302 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100302() {
    super(new long[] {-8, 7, 2}, new long[] {1, 1, 3});
  }
}
