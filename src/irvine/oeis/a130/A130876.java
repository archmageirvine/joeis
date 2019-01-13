package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130876.
 * @author Sean A. Irvine
 */
public class A130876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130876() {
    super(new long[] {1, -3, 3}, new long[] {1, 1730, 5188});
  }
}
