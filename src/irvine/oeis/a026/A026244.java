package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026244.
 * @author Sean A. Irvine
 */
public class A026244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026244() {
    super(new long[] {-64, 20}, new long[] {1, 10});
  }
}
