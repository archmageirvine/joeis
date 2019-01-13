package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171513.
 * @author Sean A. Irvine
 */
public class A171513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171513() {
    super(new long[] {1000, -1110, 111}, new long[] {10, 181, 10801});
  }
}
