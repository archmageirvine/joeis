package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128862.
 * @author Sean A. Irvine
 */
public class A128862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128862() {
    super(new long[] {1, -15, 15}, new long[] {1, 10, 136});
  }
}
