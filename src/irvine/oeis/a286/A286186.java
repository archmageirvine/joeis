package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286186.
 * @author Sean A. Irvine
 */
public class A286186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286186() {
    super(new long[] {4, -9, 6}, new long[] {7, 22, 73});
  }
}
