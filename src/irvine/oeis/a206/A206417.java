package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206417.
 * @author Sean A. Irvine
 */
public class A206417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206417() {
    super(new long[] {-1, 0, 2}, new long[] {0, 3, 7});
  }
}
