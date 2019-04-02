package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199113 (11*3^n+1)/2.
 * @author Sean A. Irvine
 */
public class A199113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199113() {
    super(new long[] {-3, 4}, new long[] {6, 17});
  }
}
