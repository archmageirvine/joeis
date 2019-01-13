package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037507.
 * @author Sean A. Irvine
 */
public class A037507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037507() {
    super(new long[] {-6, 1, 0, 6}, new long[] {1, 8, 48, 289});
  }
}
