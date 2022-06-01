package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130876 Centered 1729-gonal numbers.
 * @author Sean A. Irvine
 */
public class A130876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130876() {
    super(new long[] {1, -3, 3}, new long[] {1, 1730, 5188});
  }
}
