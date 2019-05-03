package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100230 Main diagonal of triangle <code>A100229</code>.
 * @author Sean A. Irvine
 */
public class A100230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100230() {
    super(new long[] {-1, -2, 4}, new long[] {1, 2, 10});
  }
}
