package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100145.
 * @author Sean A. Irvine
 */
public class A100145 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100145() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 120, 579, 1600});
  }
}
