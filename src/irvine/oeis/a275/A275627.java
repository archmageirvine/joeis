package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275627.
 * @author Sean A. Irvine
 */
public class A275627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275627() {
    super(new long[] {1, 0, 0, 0, 0, 1}, new long[] {8, 10, 13, 17, 22, 28});
  }
}
