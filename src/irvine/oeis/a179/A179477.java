package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179477 Antonym of <code>A014824</code>: each term is 10 times the previous term minus n.
 * @author Sean A. Irvine
 */
public class A179477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179477() {
    super(new long[] {10, -21, 12}, new long[] {10, 99, 988});
  }
}
