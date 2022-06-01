package irvine.oeis.a171;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A171226 9+10^n+9*100^n.
 * @author Sean A. Irvine
 */
public class A171226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171226() {
    super(new long[] {1000, -1110, 111}, new long[] {19, 919, 90109});
  }
}
