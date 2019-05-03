package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254374 Digital roots of centered pentagonal numbers <code>(A005891)</code>.
 * @author Sean A. Irvine
 */
public class A254374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254374() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 6, 7, 4, 6, 4, 7, 6, 1});
  }
}
