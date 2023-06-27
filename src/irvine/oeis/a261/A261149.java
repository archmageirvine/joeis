package irvine.oeis.a261;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A261149 a(n) = 515486946529943 + (n-1)*30526020494970.
 * @author Sean A. Irvine
 */
public class A261149 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261149() {
    super(1, new long[] {-1, 2}, new long[] {515486946529943L, 546012967024913L});
  }
}
