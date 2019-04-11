package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103373 <code>a(1) = a(2) = a(3) = a(4) = a(5) = a(6) = 1</code> and for <code>n&gt;6</code>: <code>a(n) = a(n-5) + a(n-6)</code>.
 * @author Sean A. Irvine
 */
public class A103373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103373() {
    super(new long[] {1, 1, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1});
  }
}
