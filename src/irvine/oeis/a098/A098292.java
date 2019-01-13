package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098292.
 * @author Sean A. Irvine
 */
public class A098292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098292() {
    super(new long[] {-1, 731}, new long[] {1, 730});
  }
}
