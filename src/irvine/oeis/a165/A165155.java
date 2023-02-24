package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165155 a(n) = 100*a(n-1) + 11^(n-1) for n&gt;0, a(0)=0.
 * @author Sean A. Irvine
 */
public class A165155 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165155() {
    super(new long[] {-1100, 111}, new long[] {0, 1});
  }
}
