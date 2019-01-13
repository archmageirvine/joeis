package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014926.
 * @author Sean A. Irvine
 */
public class A014926 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014926() {
    super(new long[] {121, -143, 23}, new long[] {1, 23, 386});
  }
}
