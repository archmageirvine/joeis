package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025867.
 * @author Sean A. Irvine
 */
public class A025867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025867() {
    super(new long[] {1, 0, 0, 0, -1, 0, 0, -1, -1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 0, 0, 1, 2, 0, 0, 1, 2, 0, 1, 2, 3, 0, 1});
  }
}
