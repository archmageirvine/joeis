package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100579.
 * @author Sean A. Irvine
 */
public class A100579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100579() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 125, 7, 49, 158, 17, 58, 2, 1});
  }
}
