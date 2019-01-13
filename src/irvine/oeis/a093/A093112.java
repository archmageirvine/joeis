package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093112.
 * @author Sean A. Irvine
 */
public class A093112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093112() {
    super(new long[] {8, -14, 7}, new long[] {-1, 7, 47});
  }
}
