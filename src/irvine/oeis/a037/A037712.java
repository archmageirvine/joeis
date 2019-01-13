package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037712.
 * @author Sean A. Irvine
 */
public class A037712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037712() {
    super(new long[] {-7, 8, -8, 8}, new long[] {1, 10, 72, 504});
  }
}
