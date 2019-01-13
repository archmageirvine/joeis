package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286910.
 * @author Sean A. Irvine
 */
public class A286910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286910() {
    super(new long[] {1, 2, 1}, new long[] {3, 1, 5});
  }
}
