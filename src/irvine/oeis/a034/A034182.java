package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034182.
 * @author Sean A. Irvine
 */
public class A034182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034182() {
    super(new long[] {-1, -1, 3}, new long[] {1, 5, 15});
  }
}
