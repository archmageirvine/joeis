package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112627.
 * @author Sean A. Irvine
 */
public class A112627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112627() {
    super(new long[] {-16, 16, 1}, new long[] {1, 3, 19});
  }
}
