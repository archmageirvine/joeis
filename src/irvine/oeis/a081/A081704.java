package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081704.
 * @author Sean A. Irvine
 */
public class A081704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081704() {
    super(new long[] {-3, 5}, new long[] {1, 3});
  }
}
