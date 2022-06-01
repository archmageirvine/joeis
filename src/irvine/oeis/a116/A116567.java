package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116567 a(n) = +1476*a(n-6) +46656*a(n-12).
 * @author Sean A. Irvine
 */
public class A116567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116567() {
    super(new long[] {46656, 0, 0, 0, 0, 0, 1476, 0, 0, 0, 0, 0}, new long[] {0, 1, 2, 2, 40, 228, 228, 1440, 4248, 4248, 60336, 336528});
  }
}
