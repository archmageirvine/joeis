package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161498.
 * @author Sean A. Irvine
 */
public class A161498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161498() {
    super(new long[] {-1, 13, -36, 13}, new long[] {1, 13, 132, 1261});
  }
}
