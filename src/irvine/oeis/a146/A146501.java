package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146501 Period <code>6: 4,8,7,5,1,2</code>.
 * @author Sean A. Irvine
 */
public class A146501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146501() {
    super(new long[] {1, -1, 0, 1}, new long[] {4, 8, 7, 5});
  }
}
