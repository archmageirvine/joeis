package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133186 Period <code>4</code>: repeat <code>[1, 2, 1, -4]</code>.
 * @author Sean A. Irvine
 */
public class A133186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133186() {
    super(new long[] {-1, -1, -1}, new long[] {1, 2, 1});
  }
}
