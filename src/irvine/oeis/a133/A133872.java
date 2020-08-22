package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133872 Period 4: repeat [1, 1, 0, 0].
 * @author Sean A. Irvine
 */
public class A133872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133872() {
    super(new long[] {1, -1, 1}, new long[] {1, 1, 0});
  }
}
