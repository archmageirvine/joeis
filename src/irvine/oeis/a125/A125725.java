package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125725.
 * @author Sean A. Irvine
 */
public class A125725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125725() {
    super(new long[] {-7, 8}, new long[] {0, 2});
  }
}
