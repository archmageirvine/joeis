package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083065.
 * @author Sean A. Irvine
 */
public class A083065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083065() {
    super(new long[] {-5, 6}, new long[] {1, 4});
  }
}
