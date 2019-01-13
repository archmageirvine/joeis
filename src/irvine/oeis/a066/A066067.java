package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066067.
 * @author Sean A. Irvine
 */
public class A066067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066067() {
    super(new long[] {-1, 1, 1, -2, 4, -4, -1, 3}, new long[] {1, 2, 3, 6, 10, 18, 29, 49});
  }
}
