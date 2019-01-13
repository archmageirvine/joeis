package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199112.
 * @author Sean A. Irvine
 */
public class A199112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199112() {
    super(new long[] {-3, 4}, new long[] {11, 31});
  }
}
