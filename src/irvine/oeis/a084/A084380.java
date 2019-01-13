package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084380.
 * @author Sean A. Irvine
 */
public class A084380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084380() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 3, 10, 29});
  }
}
