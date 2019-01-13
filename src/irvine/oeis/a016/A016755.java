package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016755.
 * @author Sean A. Irvine
 */
public class A016755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016755() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 27, 125, 343});
  }
}
