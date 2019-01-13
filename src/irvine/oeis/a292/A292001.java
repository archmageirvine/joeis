package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292001.
 * @author Sean A. Irvine
 */
public class A292001 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292001() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {3, 26, 93, 260, 615});
  }
}
