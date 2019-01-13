package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253822.
 * @author Sean A. Irvine
 */
public class A253822 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253822() {
    super(new long[] {1, -1, -1154, 1154, 1}, new long[] {1, 256, 833, 294848, 960705});
  }
}
