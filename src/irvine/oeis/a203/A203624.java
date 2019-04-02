package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203624 Numbers which are both decagonal and octagonal.
 * @author Sean A. Irvine
 */
public class A203624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203624() {
    super(new long[] {1, -37635, 37635}, new long[] {1, 54405, 2047494625});
  }
}
