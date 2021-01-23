package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112087 4*(n^2 - n + 1).
 * @author Sean A. Irvine
 */
public class A112087 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112087() {
    super(new long[] {1, -3, 3}, new long[] {4, 12, 28});
  }
}
