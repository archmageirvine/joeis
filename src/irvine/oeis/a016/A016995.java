package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016995.
 * @author Sean A. Irvine
 */
public class A016995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016995() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 512, 3375, 10648});
  }
}
