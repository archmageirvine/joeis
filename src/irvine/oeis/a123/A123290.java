package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123290.
 * @author Sean A. Irvine
 */
public class A123290 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123290() {
    super(new long[] {8, -14, 7}, new long[] {2, 8, 36});
  }
}
