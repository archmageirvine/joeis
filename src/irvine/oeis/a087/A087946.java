package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087946.
 * @author Sean A. Irvine
 */
public class A087946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087946() {
    super(new long[] {2, -9, 6}, new long[] {1, 3, 10});
  }
}
