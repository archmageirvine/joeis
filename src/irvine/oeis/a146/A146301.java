package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146301 <code>a(n) =</code> (8*n+3)*(8*n+7).
 * @author Sean A. Irvine
 */
public class A146301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146301() {
    super(new long[] {1, -3, 3}, new long[] {21, 165, 437});
  }
}
