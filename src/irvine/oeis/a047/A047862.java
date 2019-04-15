package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047862 <code>a(n) = T(5,n),</code> array T given by A047858.
 * @author Sean A. Irvine
 */
public class A047862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047862() {
    super(new long[] {4, -8, 5}, new long[] {1, 7, 20});
  }
}
