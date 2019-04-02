package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033506 Number of matchings in graph P_{3} X P_{n}.
 * @author Sean A. Irvine
 */
public class A033506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033506() {
    super(new long[] {1, 0, -10, 0, 14, 4}, new long[] {1, 3, 22, 131, 823, 5096});
  }
}
