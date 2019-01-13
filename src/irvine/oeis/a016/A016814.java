package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016814.
 * @author Sean A. Irvine
 */
public class A016814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016814() {
    super(new long[] {1, -3, 3}, new long[] {1, 25, 81});
  }
}
