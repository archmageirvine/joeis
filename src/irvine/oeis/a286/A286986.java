package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286986.
 * @author Sean A. Irvine
 */
public class A286986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286986() {
    super(new long[] {-1, 6, -11, 6}, new long[] {3, 15, 54, 175});
  }
}
