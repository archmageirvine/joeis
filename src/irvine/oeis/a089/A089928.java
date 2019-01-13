package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089928.
 * @author Sean A. Irvine
 */
public class A089928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089928() {
    super(new long[] {1, 2, 0, 2}, new long[] {1, 2, 4, 10});
  }
}
