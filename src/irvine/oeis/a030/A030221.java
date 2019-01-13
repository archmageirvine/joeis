package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030221.
 * @author Sean A. Irvine
 */
public class A030221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030221() {
    super(new long[] {-1, 5}, new long[] {1, 6});
  }
}
