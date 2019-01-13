package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171248.
 * @author Sean A. Irvine
 */
public class A171248 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171248() {
    super(new long[] {1000, -1110, 111}, new long[] {8, 323, 30203});
  }
}
