package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014918.
 * @author Sean A. Irvine
 */
public class A014918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014918() {
    super(new long[] {36, -48, 13}, new long[] {1, 13, 121});
  }
}
