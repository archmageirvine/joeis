package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146160.
 * @author Sean A. Irvine
 */
public class A146160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146160() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 4, 1, 16});
  }
}
