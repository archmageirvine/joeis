package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127213 a(n) = 6^n*Lucas(n), where Lucas = A000204.
 * @author Sean A. Irvine
 */
public class A127213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127213() {
    super(1, new long[] {36, 6}, new long[] {6, 108});
  }
}
