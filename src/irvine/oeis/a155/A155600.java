package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155600.
 * @author Sean A. Irvine
 */
public class A155600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155600() {
    super(new long[] {18, -29, 12}, new long[] {1, 8, 78});
  }
}
