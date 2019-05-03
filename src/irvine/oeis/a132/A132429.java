package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132429 Period <code>4</code>: repeat <code>[3, 1, -1, -3]</code>.
 * @author Sean A. Irvine
 */
public class A132429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132429() {
    super(new long[] {-1, -1, -1}, new long[] {3, 1, -1});
  }
}
