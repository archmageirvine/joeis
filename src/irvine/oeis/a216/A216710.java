package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216710.
 * @author Sean A. Irvine
 */
public class A216710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216710() {
    super(new long[] {1, -15, 35, -28, 9}, new long[] {1, 3, 10, 35, 126});
  }
}
