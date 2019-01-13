package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017069.
 * @author Sean A. Irvine
 */
public class A017069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017069() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 32768, 1048576, 7962624, 33554432, 102400000});
  }
}
