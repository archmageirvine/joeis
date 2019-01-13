package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016937.
 * @author Sean A. Irvine
 */
public class A016937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016937() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {32, 32768, 537824, 3200000, 11881376, 33554432});
  }
}
