package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100147 Structured icosidodecahedral numbers.
 * @author Sean A. Irvine
 */
public class A100147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100147() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 30, 135, 364});
  }
}
