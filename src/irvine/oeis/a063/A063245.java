package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063245.
 * @author Sean A. Irvine
 */
public class A063245 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063245() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {3, 10, 18, 23, 31});
  }
}
