package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095930.
 * @author Sean A. Irvine
 */
public class A095930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095930() {
    super(new long[] {4, -13, 7}, new long[] {1, 4, 15});
  }
}
