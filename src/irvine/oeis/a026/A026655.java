package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026655.
 * @author Sean A. Irvine
 */
public class A026655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026655() {
    super(new long[] {2, 0, 4, 0}, new long[] {1, 2, 5, 10});
  }
}
