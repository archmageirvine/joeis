package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155670 11^n+9^n-1^n.
 * @author Sean A. Irvine
 */
public class A155670 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155670() {
    super(new long[] {99, -119, 21}, new long[] {1, 19, 201});
  }
}
