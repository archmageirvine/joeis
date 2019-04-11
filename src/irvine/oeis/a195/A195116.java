package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195116 <code>a(n) = (2+3^n)*(3+2^n)</code>.
 * @author Sean A. Irvine
 */
public class A195116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195116() {
    super(new long[] {-36, 72, -47, 12}, new long[] {12, 25, 77, 319});
  }
}
