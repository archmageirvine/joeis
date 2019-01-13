package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017297.
 * @author Sean A. Irvine
 */
public class A017297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017297() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {32, 248832, 5153632, 33554432, 130691232, 380204032});
  }
}
