package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110213.
 * @author Sean A. Irvine
 */
public class A110213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110213() {
    super(new long[] {6, 0, -5}, new long[] {1, -7, 35});
  }
}
