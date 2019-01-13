package irvine.oeis.a039;

import irvine.oeis.LinearRecurrence;

/**
 * A039304.
 * @author Sean A. Irvine
 */
public class A039304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A039304() {
    super(new long[] {-7, 1, 7}, new long[] {1, 4, 22});
  }
}
