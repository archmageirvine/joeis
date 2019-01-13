package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118831.
 * @author Sean A. Irvine
 */
public class A118831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118831() {
    super(new long[] {-1, 0, 0, 0}, new long[] {-1, -1, 0, -1});
  }
}
