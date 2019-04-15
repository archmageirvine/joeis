package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099142 <code>6^n*T(n,4/3)</code>.
 * @author Sean A. Irvine
 */
public class A099142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099142() {
    super(new long[] {-36, 16}, new long[] {1, 8});
  }
}
