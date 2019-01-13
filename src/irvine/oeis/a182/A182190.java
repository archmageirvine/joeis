package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182190.
 * @author Sean A. Irvine
 */
public class A182190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182190() {
    super(new long[] {1, -7, 7}, new long[] {0, 4, 28});
  }
}
