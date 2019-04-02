package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103376 a(1) = a(2) = a(3) = a(4) = a(5) = a(6) = a(7) = a(8) = a(9) = 1 and for n&gt;9: a(n) = a(n-8) + a(n-9).
 * @author Sean A. Irvine
 */
public class A103376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103376() {
    super(new long[] {1, 1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
