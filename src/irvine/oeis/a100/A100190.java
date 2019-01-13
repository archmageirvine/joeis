package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100190.
 * @author Sean A. Irvine
 */
public class A100190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100190() {
    super(new long[] {-9, 24, -22, 8}, new long[] {1, 20, 147, 760});
  }
}
