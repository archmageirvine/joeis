package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064385 <code>a(n) = 2*5^n - 3</code>.
 * @author Sean A. Irvine
 */
public class A064385 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064385() {
    super(new long[] {-5, 6}, new long[] {7, 47});
  }
}
