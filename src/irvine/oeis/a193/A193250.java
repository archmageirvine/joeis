package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193250.
 * @author Sean A. Irvine
 */
public class A193250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193250() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 51, 245, 679});
  }
}
