package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192815.
 * @author Sean A. Irvine
 */
public class A192815 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192815() {
    super(new long[] {7, -3, 5}, new long[] {0, 2, 4});
  }
}
