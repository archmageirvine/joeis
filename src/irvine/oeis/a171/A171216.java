package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171216 (4^(5*n+1) + 7)/11.
 * @author Sean A. Irvine
 */
public class A171216 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171216() {
    super(new long[] {-1024, 1025}, new long[] {373, 381301});
  }
}
