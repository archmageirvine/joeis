package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291230.
 * @author Sean A. Irvine
 */
public class A291230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291230() {
    super(new long[] {1, 6, 8, -6, -8, 6}, new long[] {6, 25, 96, 351, 1242, 4304});
  }
}
