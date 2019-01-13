package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102652.
 * @author Sean A. Irvine
 */
public class A102652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102652() {
    super(new long[] {-2, 3, -3, 3}, new long[] {4, 12, 24, 48});
  }
}
