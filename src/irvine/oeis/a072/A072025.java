package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072025.
 * @author Sean A. Irvine
 */
public class A072025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072025() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 11, 55, 181, 461});
  }
}
