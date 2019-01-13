package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124363.
 * @author Sean A. Irvine
 */
public class A124363 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124363() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 73, 151, 241});
  }
}
