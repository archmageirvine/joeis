package irvine.oeis.a255;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A255813 Numbers of words on {0,1,2,3} having no isolated zeros.
 * @author Sean A. Irvine
 */
public class A255813 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255813() {
    super(new long[] {3, -3, 4}, new long[] {1, 3, 10});
  }
}
