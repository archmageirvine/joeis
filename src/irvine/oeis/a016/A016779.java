package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016779.
 * @author Sean A. Irvine
 */
public class A016779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016779() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 64, 343, 1000});
  }
}
