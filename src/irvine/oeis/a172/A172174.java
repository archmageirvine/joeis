package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172174 <code>a(n) = a(n-1)*90 + 1</code>.
 * @author Sean A. Irvine
 */
public class A172174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172174() {
    super(new long[] {-90, 91}, new long[] {1, 91});
  }
}
