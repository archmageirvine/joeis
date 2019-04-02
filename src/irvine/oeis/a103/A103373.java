package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103373 a(1) = a(2) = a(3) = a(4) = a(5) = a(6) = 1 and for n&gt;6: a(n) = a(n-5) + a(n-6).
 * @author Sean A. Irvine
 */
public class A103373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103373() {
    super(new long[] {1, 1, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1});
  }
}
