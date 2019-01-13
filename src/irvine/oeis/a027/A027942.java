package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027942.
 * @author Sean A. Irvine
 */
public class A027942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027942() {
    super(new long[] {1, -6, 13, -13, 6}, new long[] {1, 11, 51, 176, 530});
  }
}
