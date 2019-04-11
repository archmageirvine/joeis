package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025937 Expansion of <code>1/((1-2x)(1-3x)(1-6x)(1-7x))</code>.
 * @author Sean A. Irvine
 */
public class A025937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025937() {
    super(new long[] {-252, 288, -113, 18}, new long[] {1, 18, 211, 2052});
  }
}
