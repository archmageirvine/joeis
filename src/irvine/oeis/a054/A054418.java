package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054418.
 * @author Sean A. Irvine
 */
public class A054418 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054418() {
    super(new long[] {5, -3, 7}, new long[] {1, 8, 53});
  }
}
