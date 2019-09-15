package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099141 <code>5^n*T(n,7/5)</code>.
 * @author Sean A. Irvine
 */
public class A099141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099141() {
    super(new long[] {-25, 14}, new long[] {1, 7});
  }
}
