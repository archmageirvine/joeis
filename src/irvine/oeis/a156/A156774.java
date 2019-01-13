package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156774.
 * @author Sean A. Irvine
 */
public class A156774 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156774() {
    super(new long[] {1, -3, 3}, new long[] {485, 3482, 19601});
  }
}
