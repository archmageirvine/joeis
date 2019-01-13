package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182432.
 * @author Sean A. Irvine
 */
public class A182432 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182432() {
    super(new long[] {1, -9, 9}, new long[] {1, 4, 28});
  }
}
