package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193248.
 * @author Sean A. Irvine
 */
public class A193248 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193248() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 93, 455, 1267});
  }
}
