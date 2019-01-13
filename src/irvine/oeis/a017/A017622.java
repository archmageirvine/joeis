package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017622.
 * @author Sean A. Irvine
 */
public class A017622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017622() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {262144, 64000000, 1073741824, 7256313856L, 30840979456L, 98867482624L, 262144000000L});
  }
}
