package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047849 <code>a(n) = (4^n + 2)/3</code>.
 * @author Sean A. Irvine
 */
public class A047849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047849() {
    super(new long[] {-4, 5}, new long[] {1, 2});
  }
}
