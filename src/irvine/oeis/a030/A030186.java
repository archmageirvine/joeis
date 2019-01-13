package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030186.
 * @author Sean A. Irvine
 */
public class A030186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030186() {
    super(new long[] {-1, 1, 3}, new long[] {1, 2, 7});
  }
}
