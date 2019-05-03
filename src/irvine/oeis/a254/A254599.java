package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254599 Numbers of words on alphabet <code>{0,1,...,9}</code> with no subwords ii, for i from <code>{0,1}</code>.
 * @author Sean A. Irvine
 */
public class A254599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254599() {
    super(new long[] {8, 9}, new long[] {1, 10});
  }
}
