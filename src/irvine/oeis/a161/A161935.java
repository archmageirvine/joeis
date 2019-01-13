package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161935.
 * @author Sean A. Irvine
 */
public class A161935 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161935() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 28});
  }
}
