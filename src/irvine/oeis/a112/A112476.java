package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112476.
 * @author Sean A. Irvine
 */
public class A112476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112476() {
    super(new long[] {1, 2, 2, 0}, new long[] {1, -1, 2, 0});
  }
}
