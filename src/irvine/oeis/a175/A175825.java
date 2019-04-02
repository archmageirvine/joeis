package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175825 Maximum signed integer that can be stored in n bytes.
 * @author Sean A. Irvine
 */
public class A175825 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175825() {
    super(new long[] {-256, 257}, new long[] {127, 32767});
  }
}
