package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099158 <code>5^(n-1)*U(n-1,7/5)</code>.
 * @author Sean A. Irvine
 */
public class A099158 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099158() {
    super(new long[] {-25, 14}, new long[] {0, 1});
  }
}
