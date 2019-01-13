package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125128.
 * @author Sean A. Irvine
 */
public class A125128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125128() {
    super(new long[] {2, -5, 4}, new long[] {1, 4, 11});
  }
}
