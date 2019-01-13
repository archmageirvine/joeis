package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155650.
 * @author Sean A. Irvine
 */
public class A155650 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155650() {
    super(new long[] {42, -55, 14}, new long[] {1, 2, 14});
  }
}
