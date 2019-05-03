package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132677 Period <code>3</code>: repeat <code>[1, 2, -3]</code>.
 * @author Sean A. Irvine
 */
public class A132677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132677() {
    super(new long[] {-1, -1}, new long[] {1, 2});
  }
}
