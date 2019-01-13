package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140780.
 * @author Sean A. Irvine
 */
public class A140780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140780() {
    super(new long[] {-1, 10}, new long[] {1, 3});
  }
}
