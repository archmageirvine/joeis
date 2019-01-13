package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051361.
 * @author Sean A. Irvine
 */
public class A051361 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051361() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 0, 0, 13, 75, 263, 720, 1688});
  }
}
