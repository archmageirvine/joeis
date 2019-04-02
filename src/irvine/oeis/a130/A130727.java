package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130727 List of triples 2n+1, 2n+3, 2n+2.
 * @author Sean A. Irvine
 */
public class A130727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130727() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 3, 2, 3});
  }
}
