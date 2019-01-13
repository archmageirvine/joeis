package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199404.
 * @author Sean A. Irvine
 */
public class A199404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199404() {
    super(new long[] {-1, 0, 11, 0}, new long[] {1, 4, 7, 43});
  }
}
