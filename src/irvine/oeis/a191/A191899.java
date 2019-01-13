package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191899.
 * @author Sean A. Irvine
 */
public class A191899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191899() {
    super(new long[] {1, -8, 27, -48, 42, 0, -42, 48, -27, 8}, new long[] {0, 128, 3280, 32768, 195312, 839808, 2882400, 8388608, 21523360, 50000000});
  }
}
