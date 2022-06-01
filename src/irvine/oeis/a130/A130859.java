package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130859 1729-gonal numbers.
 * @author Sean A. Irvine
 */
public class A130859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130859() {
    super(new long[] {1, -3, 3}, new long[] {1, 1729, 5184});
  }
}
