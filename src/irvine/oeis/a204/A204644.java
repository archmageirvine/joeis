package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204644.
 * @author Sean A. Irvine
 */
public class A204644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204644() {
    super(new long[] {-1, 0, 2}, new long[] {8, 16, 28});
  }
}
