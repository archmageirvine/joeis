package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133186 Period 4: repeat [1, 2, 1, -4].
 * @author Sean A. Irvine
 */
public class A133186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133186() {
    super(new long[] {-1, -1, -1}, new long[] {1, 2, 1});
  }
}
