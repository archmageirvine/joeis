package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291002 p-INVERT of <code>(1,1,1,1,1,...)</code>, where <code>p(S) = (1 - S)(1 - 2*S)(1 - 3*S)</code>.
 * @author Sean A. Irvine
 */
public class A291002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291002() {
    super(new long[] {24, -26, 9}, new long[] {6, 31, 146});
  }
}
