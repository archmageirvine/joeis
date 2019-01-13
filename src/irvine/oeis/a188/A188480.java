package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188480.
 * @author Sean A. Irvine
 */
public class A188480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188480() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 10, 39, 99, 203});
  }
}
