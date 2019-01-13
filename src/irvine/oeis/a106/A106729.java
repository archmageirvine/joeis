package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106729.
 * @author Sean A. Irvine
 */
public class A106729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106729() {
    super(new long[] {-1, 3}, new long[] {5, 10});
  }
}
