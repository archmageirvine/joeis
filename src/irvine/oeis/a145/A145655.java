package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145655 Partial sums of <code>A080674</code>.
 * @author Sean A. Irvine
 */
public class A145655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145655() {
    super(new long[] {4, -9, 6}, new long[] {4, 24, 108});
  }
}
