package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016260.
 * @author Sean A. Irvine
 */
public class A016260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016260() {
    super(new long[] {96, -116, 21}, new long[] {1, 21, 325});
  }
}
