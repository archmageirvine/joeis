package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141038.
 * @author Sean A. Irvine
 */
public class A141038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141038() {
    super(new long[] {1, 1, 0}, new long[] {2, 1, 1});
  }
}
