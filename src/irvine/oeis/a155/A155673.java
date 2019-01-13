package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155673.
 * @author Sean A. Irvine
 */
public class A155673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155673() {
    super(new long[] {110, -131, 22}, new long[] {1, 20, 220});
  }
}
