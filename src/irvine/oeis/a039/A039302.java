package irvine.oeis.a039;

import irvine.oeis.LinearRecurrence;

/**
 * A039302.
 * @author Sean A. Irvine
 */
public class A039302 extends LinearRecurrence {

  /** Construct the sequence. */
  public A039302() {
    super(new long[] {-5, 1, 5}, new long[] {1, 3, 11});
  }
}
