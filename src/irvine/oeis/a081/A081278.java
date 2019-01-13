package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081278.
 * @author Sean A. Irvine
 */
public class A081278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081278() {
    super(new long[] {27, -27, 9}, new long[] {1, 6, 29});
  }
}
