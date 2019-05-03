package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165367 Trisection <code>a(n) = A026741(3n + 2)</code>.
 * @author Sean A. Irvine
 */
public class A165367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165367() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 5, 4, 11});
  }
}
