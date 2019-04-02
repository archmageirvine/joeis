package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131579 Period 10: repeat 0, 3, 6, 9, 2, 5, 8, 1, 4, 7.
 * @author Sean A. Irvine
 */
public class A131579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131579() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 3, 6, 9, 2, 5, 8, 1, 4, 7});
  }
}
