package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026915.
 * @author Sean A. Irvine
 */
public class A026915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026915() {
    super(new long[] {2, -5, 4}, new long[] {1, 26, 100});
  }
}
