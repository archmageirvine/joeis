package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048777 First partial sums of A005409; second partial sums of A001333.
 * @author Sean A. Irvine
 */
public class A048777 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048777() {
    super(new long[] {1, 0, -4, 4}, new long[] {1, 5, 16, 44});
  }
}
