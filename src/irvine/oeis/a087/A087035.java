package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087035.
 * @author Sean A. Irvine
 */
public class A087035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087035() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 4, 13, 28, 53});
  }
}
