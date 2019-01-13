package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161999.
 * @author Sean A. Irvine
 */
public class A161999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161999() {
    super(new long[] {-99, 0, 20, 0}, new long[] {0, 1, 1, 10});
  }
}
