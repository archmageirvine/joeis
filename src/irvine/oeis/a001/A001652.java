package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001652.
 * @author Sean A. Irvine
 */
public class A001652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001652() {
    super(new long[] {1, -7, 7}, new long[] {0, 3, 20});
  }
}
