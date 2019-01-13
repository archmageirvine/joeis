package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286716.
 * @author Sean A. Irvine
 */
public class A286716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286716() {
    super(new long[] {-1, 0, 1, 0, 0, 1, 0}, new long[] {0, 0, 1, 1, 1, 1, 2});
  }
}
