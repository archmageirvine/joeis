package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081680.
 * @author Sean A. Irvine
 */
public class A081680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081680() {
    super(new long[] {2520, -2754, 1175, -245, 25}, new long[] {1, 2, 4, 23, 274});
  }
}
