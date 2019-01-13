package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084330.
 * @author Sean A. Irvine
 */
public class A084330 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084330() {
    super(new long[] {-29, 31}, new long[] {0, 1});
  }
}
