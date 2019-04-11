package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135695 Period 6: repeat <code>[-1, -1, -2, -2, 3, 3]</code>.
 * @author Sean A. Irvine
 */
public class A135695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135695() {
    super(new long[] {-1, 0, -1, 0}, new long[] {-1, -1, -2, -2});
  }
}
