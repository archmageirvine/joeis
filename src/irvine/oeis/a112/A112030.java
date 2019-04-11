package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112030 <code>a(n) = (2 + (-1)^n) * (-1)^floor(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A112030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112030() {
    super(new long[] {-1, 0}, new long[] {3, 1});
  }
}
