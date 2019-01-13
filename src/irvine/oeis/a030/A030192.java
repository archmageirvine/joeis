package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030192.
 * @author Sean A. Irvine
 */
public class A030192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030192() {
    super(new long[] {-6, 6}, new long[] {1, 6});
  }
}
