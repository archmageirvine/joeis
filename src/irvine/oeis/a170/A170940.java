package irvine.oeis.a170;

import irvine.oeis.LinearRecurrence;

/**
 * A170940 <code>4^n-2^n-2</code>.
 * @author Sean A. Irvine
 */
public class A170940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A170940() {
    super(new long[] {8, -14, 7}, new long[] {0, 10, 54});
  }
}
