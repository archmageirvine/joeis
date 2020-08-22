package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254599 Numbers of words on alphabet {0,1,...,9} with no subwords ii, for i from {0,1}.
 * @author Sean A. Irvine
 */
public class A254599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254599() {
    super(new long[] {8, 9}, new long[] {1, 10});
  }
}
