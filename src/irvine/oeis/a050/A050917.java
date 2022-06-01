package irvine.oeis.a050;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A050917 a(n) = n*6^n + 1.
 * @author Sean A. Irvine
 */
public class A050917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050917() {
    super(new long[] {36, -48, 13}, new long[] {1, 7, 73});
  }
}
