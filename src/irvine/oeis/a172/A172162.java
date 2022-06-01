package irvine.oeis.a172;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A172162 a(n) = ( A165154(n) + A165155(n) )/2.
 * @author Sean A. Irvine
 */
public class A172162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172162() {
    super(new long[] {-9900, -101, 102}, new long[] {0, 1, 101});
  }
}
