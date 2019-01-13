package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027180.
 * @author Sean A. Irvine
 */
public class A027180 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027180() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 7, 27, 79});
  }
}
