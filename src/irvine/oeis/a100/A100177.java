package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100177.
 * @author Sean A. Irvine
 */
public class A100177 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100177() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 4, 18, 64, 175});
  }
}
