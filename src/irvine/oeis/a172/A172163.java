package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172163 a(n) = ( A165155(n) - A165154(n) )/2.
 * @author Sean A. Irvine
 */
public class A172163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172163() {
    super(new long[] {-9900, -101, 102}, new long[] {0, 0, 10});
  }
}
