package irvine.oeis.a170;

import irvine.oeis.LinearRecurrence;

/**
 * A170938.
 * @author Sean A. Irvine
 */
public class A170938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A170938() {
    super(new long[] {8, -14, 7}, new long[] {4, 8, 22});
  }
}
