package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168210.
 * @author Sean A. Irvine
 */
public class A168210 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168210() {
    super(new long[] {-1, 1, 1}, new long[] {0, 13, 6});
  }
}
