package irvine.oeis.a222;

import irvine.oeis.LinearRecurrence;

/**
 * A222716.
 * @author Sean A. Irvine
 */
public class A222716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222716() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 10, 100, 460, 1460, 3710});
  }
}
