package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133872 Period <code>4</code>: repeat <code>[1, 1, 0, 0]</code>.
 * @author Sean A. Irvine
 */
public class A133872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133872() {
    super(new long[] {1, -1, 1}, new long[] {1, 1, 0});
  }
}
