package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286902.
 * @author Sean A. Irvine
 */
public class A286902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286902() {
    super(new long[] {5, 4, 3, 2, 1}, new long[] {1, 2, 3, 4, 5});
  }
}
