package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016929 <code>a(n) = (6*n + 1)^9</code>.
 * @author Sean A. Irvine
 */
public class A016929 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016929() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 40353607, 10604499373L, 322687697779L, 3814697265625L, 26439622160671L, 129961739795077L, 502592611936843L, 1628413597910449L, 4605366583984375L});
  }
}
