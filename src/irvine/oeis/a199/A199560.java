package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199560 (3*9^n+1)/2.
 * @author Sean A. Irvine
 */
public class A199560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199560() {
    super(new long[] {-9, 10}, new long[] {2, 14});
  }
}
