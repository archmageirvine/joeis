package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173127 <code>a(n) =</code> sinh((2n-1)*arcsinh(3)).
 * @author Sean A. Irvine
 */
public class A173127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173127() {
    super(new long[] {-1, 38}, new long[] {-3, 3});
  }
}
