package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081570 Fifth binomial transform of F(n+1).
 * @author Sean A. Irvine
 */
public class A081570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081570() {
    super(new long[] {-29, 11}, new long[] {1, 6});
  }
}
