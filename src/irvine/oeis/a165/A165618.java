package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165618 <code>Binomial(n+8,8)-1</code>.
 * @author Sean A. Irvine
 */
public class A165618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165618() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 8, 44, 164, 494, 1286, 3002, 6434, 12869});
  }
}
