package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063212.
 * @author Sean A. Irvine
 */
public class A063212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063212() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {1, 3, 3, 7, 7});
  }
}
