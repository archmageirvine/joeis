package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193228.
 * @author Sean A. Irvine
 */
public class A193228 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193228() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 39, 185, 511});
  }
}
