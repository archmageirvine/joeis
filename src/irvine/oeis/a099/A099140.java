package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099140 <code>4^n*T(n,3/2)</code>.
 * @author Sean A. Irvine
 */
public class A099140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099140() {
    super(new long[] {-16, 12}, new long[] {1, 6});
  }
}
