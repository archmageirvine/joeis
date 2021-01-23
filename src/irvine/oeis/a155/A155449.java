package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155449 Numbers n == 6 or 11 mod 17.
 * @author Sean A. Irvine
 */
public class A155449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155449() {
    super(new long[] {-1, 1, 1}, new long[] {6, 11, 23});
  }
}
