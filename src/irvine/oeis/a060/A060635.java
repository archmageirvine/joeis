package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060635.
 * @author Sean A. Irvine
 */
public class A060635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060635() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {2, 8, 72, 450, 3200});
  }
}
