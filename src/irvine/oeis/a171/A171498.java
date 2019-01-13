package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171498.
 * @author Sean A. Irvine
 */
public class A171498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171498() {
    super(new long[] {-3, 4}, new long[] {3, 11});
  }
}
