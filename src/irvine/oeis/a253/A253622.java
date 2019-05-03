package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253622 Centered heptagonal numbers <code>(A069099)</code> which are also centered pentagonal numbers <code>(A005891)</code>.
 * @author Sean A. Irvine
 */
public class A253622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253622() {
    super(new long[] {1, -143, 143}, new long[] {1, 106, 15016});
  }
}
