package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134393 Row sums of triangle A134392.
 * @author Sean A. Irvine
 */
public class A134393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134393() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 3, 8, 20, 45});
  }
}
