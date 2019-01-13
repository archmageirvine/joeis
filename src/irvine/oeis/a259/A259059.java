package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259059.
 * @author Sean A. Irvine
 */
public class A259059 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259059() {
    super(new long[] {1, -3, 3}, new long[] {227, 265, 307});
  }
}
