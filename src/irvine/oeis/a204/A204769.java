package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204769.
 * @author Sean A. Irvine
 */
public class A204769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204769() {
    super(new long[] {-1, 1, 1}, new long[] {46, 105, 197});
  }
}
