package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051874.
 * @author Sean A. Irvine
 */
public class A051874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051874() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 22});
  }
}
