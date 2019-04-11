package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099868 <code>a(n) = 5*a(n-1) - a(n-2), a(0) = 3, a(1) = 25</code>.
 * @author Sean A. Irvine
 */
public class A099868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099868() {
    super(new long[] {-1, 5}, new long[] {3, 25});
  }
}
