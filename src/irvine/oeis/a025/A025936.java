package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025936.
 * @author Sean A. Irvine
 */
public class A025936 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025936() {
    super(new long[] {-360, 402, -151, 22}, new long[] {1, 22, 333, 4406});
  }
}
