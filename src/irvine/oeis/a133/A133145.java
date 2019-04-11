package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133145 Period 4: repeat <code>[1, 2, 4, 8]</code>.
 * @author Sean A. Irvine
 */
public class A133145 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133145() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 2, 4, 8});
  }
}
