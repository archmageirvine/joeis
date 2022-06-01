package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047862 a(n) = T(5,n), array T given by A047858.
 * @author Sean A. Irvine
 */
public class A047862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047862() {
    super(new long[] {4, -8, 5}, new long[] {1, 7, 20});
  }
}
