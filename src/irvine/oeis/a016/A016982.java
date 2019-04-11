package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016982 <code>a(n) = (7*n)^2</code>.
 * @author Sean A. Irvine
 */
public class A016982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016982() {
    super(new long[] {1, -3, 3}, new long[] {0, 49, 196});
  }
}
