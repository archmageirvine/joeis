package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112091.
 * @author Sean A. Irvine
 */
public class A112091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112091() {
    super(new long[] {5, -10, 6}, new long[] {1, 2, 6});
  }
}
