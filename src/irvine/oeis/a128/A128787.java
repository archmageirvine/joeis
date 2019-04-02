package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128787 n^2*8^n.
 * @author Sean A. Irvine
 */
public class A128787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128787() {
    super(new long[] {512, -192, 24}, new long[] {0, 8, 256});
  }
}
