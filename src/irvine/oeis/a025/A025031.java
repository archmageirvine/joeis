package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025031.
 * @author Sean A. Irvine
 */
public class A025031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025031() {
    super(new long[] {-1080, 1398, -349, 32}, new long[] {1, 32, 675, 11830});
  }
}
