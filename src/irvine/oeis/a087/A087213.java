package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087213.
 * @author Sean A. Irvine
 */
public class A087213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087213() {
    super(new long[] {4, 4, -1}, new long[] {1, 0, 0});
  }
}
