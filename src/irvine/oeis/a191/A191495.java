package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191495 Number of compositions of even natural numbers into 8 parts <code>&lt;= n</code>.
 * @author Sean A. Irvine
 */
public class A191495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191495() {
    super(new long[] {1, -8, 27, -48, 42, 0, -42, 48, -27, 8}, new long[] {1, 128, 3281, 32768, 195313, 839808, 2882401, 8388608, 21523361, 50000000});
  }
}
