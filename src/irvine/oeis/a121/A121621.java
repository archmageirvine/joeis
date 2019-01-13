package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121621.
 * @author Sean A. Irvine
 */
public class A121621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121621() {
    super(new long[] {-13, 4}, new long[] {1, 2});
  }
}
