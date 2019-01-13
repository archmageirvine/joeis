package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081019.
 * @author Sean A. Irvine
 */
public class A081019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081019() {
    super(new long[] {1, -8, 8}, new long[] {3, 28, 198});
  }
}
