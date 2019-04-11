package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024042 <code>a(n) = 4^n - n^6</code>.
 * @author Sean A. Irvine
 */
public class A024042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024042() {
    super(new long[] {-4, 29, -91, 161, -175, 119, -49, 11}, new long[] {1, 3, -48, -665, -3840, -14601, -42560, -101265});
  }
}
