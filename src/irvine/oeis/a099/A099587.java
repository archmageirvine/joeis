package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099587 <code>a(n) =</code> coefficient of x in <code>(1+x)^n mod (1+x^4)</code>.
 * @author Sean A. Irvine
 */
public class A099587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099587() {
    super(new long[] {-2, 4, -6, 4}, new long[] {0, 1, 2, 3});
  }
}
