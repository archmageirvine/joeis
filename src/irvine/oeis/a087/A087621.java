package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087621 (1,1) entry of powers of the orthogonal design shown below.
 * @author Sean A. Irvine
 */
public class A087621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087621() {
    super(new long[] {-64, 0, 4, 0}, new long[] {-1, 2, 4, -56});
  }
}
