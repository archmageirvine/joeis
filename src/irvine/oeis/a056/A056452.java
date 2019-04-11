package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056452 <code>a(n) = 6^floor((n+1)/2)</code>.
 * @author Sean A. Irvine
 */
public class A056452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056452() {
    super(new long[] {6, 0}, new long[] {1, 6});
  }
}
