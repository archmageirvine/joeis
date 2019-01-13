package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155653.
 * @author Sean A. Irvine
 */
public class A155653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155653() {
    super(new long[] {60, -76, 17}, new long[] {1, 5, 65});
  }
}
